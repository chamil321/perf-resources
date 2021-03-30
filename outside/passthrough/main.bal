import ballerina/http;
import ballerina/log;

http:Client clientEP = check new ("http://172.17.0.2:8688/hello");

service /passthrough on new http:Listener(9090) {

    resource function 'default .(http:Caller caller, http:Request req) {

        var clientResponse = clientEP->forward("/", req);


        if (clientResponse is http:Response) {
            // If the request was successful, an HTTP response is returned.
            // Here, the received response is forwarded to the client through the outbound endpoint.
            var result = caller->respond(<@untainted>clientResponse);
            if (result is error) {
                log:printError("Error sending response", err = result);
            }
        } else {
            // If there was an error, the 500 error response is constructed and sent back to the client.
            http:Response res = new;
            res.statusCode = 500;
            res.setPayload((<@untainted error>clientResponse).message());
            var result = caller->respond(res);
            if (result is error) {
                log:printError("Error sending response", err = result);
            }
        }
    }
}
