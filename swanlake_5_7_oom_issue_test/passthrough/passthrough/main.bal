import ballerinax/worldbank;
import ballerinax/covid19;
import ballerina/http;

service / on new http:Listener(8090) {

    isolated resource function get stats/[string country](http:Caller caller, http:Request request) returns error? {
        // covid19:Client covid19Client = check new ();
        covid19:Client covid19Client = check new (serviceUrl = "http://<Covid-BE-IP>:9090");
        covid19:CovidCountry statusByCountry = check covid19Client->getStatusByCountry(country);
        var totalCases = statusByCountry?.cases ?: 0d;
        // worldbank:Client worldBankClient = check new ();
        worldbank:Client worldBankClient = check new (serviceUrl = "http://<Worldbank-BE-IP>:9095");
        worldbank:CountryPopulation[] populationByCountry = check worldBankClient->getPopulationByCountry(country, "2019");
        int population = (populationByCountry[0]?.value ?: 0) / 1000000;
        var totalCasesPerMillion = totalCases / population;
        json payload = {country : country, totalCasesPerMillion : totalCasesPerMillion};
        check caller->respond(payload);
    }
}
