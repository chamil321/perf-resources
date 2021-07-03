import ballerina/http;

json payload = {
   "updated":1625214989362,
   "country":"Sri Lanka",
   "countryInfo":{
      "_id":144,
      "iso2":"LK",
      "iso3":"LKA",
      "lat":7,
      "long":81,
      "flag":"https://disease.sh/assets/img/flags/lk.png"
   },
   "cases":260972,
   "todayCases":0,
   "deaths":3120,
   "todayDeaths":0,
   "recovered":227840,
   "todayRecovered":0,
   "active":30012,
   "critical":0,
   "casesPerOneMillion":12137,
   "deathsPerOneMillion":145,
   "tests":3743577,
   "testsPerOneMillion":174097,
   "population":21502881,
   "continent":"Asia",
   "oneCasePerPeople":82,
   "oneDeathPerPeople":6892,
   "oneTestPerPeople":6,
   "undefined":1396,
   "activePerOneMillion":1395.72,
   "recoveredPerOneMillion":10595.79,
   "criticalPerOneMillion":0
};

@http:ServiceConfig {
    chunking: http:CHUNKING_ALWAYS
}
service /v3/covid\-19 on new http:Listener(9090) {

    resource function 'default countries/[string code]() returns http:Response {
	    
        http:Response res = new;
        res.statusCode = 200;
        res.setJsonPayload(payload);

        res.setHeader("access-control-allow-origin", "*");
        res.setHeader("alt-svc", "h3-27=\":443\"; ma=86400, h3-28=\":443\"; ma=86400, h3-29=\":443\"; ma=86400, h3=\":443\"; ma=86400");
        res.setHeader("Cache-Control", "public, max-age=14400");
        res.setHeader("CF-Cache-Status", "DYNAMIC");
        res.setHeader("CF-RAY", "6686ef375f687f23-CMB");
        res.setHeader("Connection", "keep-alive");
        res.setHeader("Content-Type", "application/json; charset=utf-8");
        res.setHeader("etag", "W/\"25f-VB/B7cwRxpkTFPnufB0QcTCzHUE\"");
        res.setHeader("Expect-CT", "max-age=604800, report-uri=\"https://report-uri.cloudflare.com/cdn-cgi/beacon/expect-ct\"");
        res.setHeader("NG-Cache-Status", "MISS");
        res.setHeader("NG-Key", "httpsGETdisease.sh/v3/covid-19/countries/LK");
        res.setHeader("Strict-Transport-Security", "max-age=15724800; includeSubDomains");
        res.setHeader("Vary", "Accept-Encoding");
        res.setHeader("x-envoy-upstream-service-time", "6");
        res.setHeader("x-powered-by", "Express");

        return res;
    }
}
