package com.sample.calculator_soap;




import io.spring.guides.gs_producing_web_service.AddNumbersRequest;
import io.spring.guides.gs_producing_web_service.AddNumbersResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CalculatorEndpoint {

    //private static final String NAMESPACE_URI = "http://www.calculator.com";
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addNumbersRequest")
    @ResponsePayload
    public AddNumbersResponse addNumbers(@RequestPayload AddNumbersRequest addNumbersRequest){
        AddNumbersResponse addNumbersResponse = new AddNumbersResponse();
        addNumbersResponse.setResult(addNumbersRequest.getInputOne()+addNumbersRequest.getInputTwo());
        return addNumbersResponse;
    }
}
