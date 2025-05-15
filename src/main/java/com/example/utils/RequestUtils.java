package com.example.utils;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class RequestUtils {
    static RequestSpecification req = RestAssured.given();
    public static RequestSpecification createSpec() throws IOException {
//        return new RequestSpecBuilder().setBaseUri(GetProperties.getBaseURL()).build();
        return RestAssured.given().baseUri(GetProperties.getBaseURL());
    }
    public static RequestSpecification addHeaderWithToken(RequestSpecification req,String token){
        req.header("Content-Type","application/json");
        req.header("authorization","bearer "+token);

        return req;
    }
    public static RequestSpecification addHeaderWithoutToken(RequestSpecification req){
        req.header("Content-Type","application/json");
        return req;
    }
    public static RequestSpecification addBasePath(RequestSpecification req,String endpoint){
        return req.basePath(endpoint);
    }
    public static RequestSpecification addPathParam(RequestSpecification req, Map<String,Object> pathParam){
        return req.pathParams(pathParam);
    }
    public static RequestSpecification addQueryParam(RequestSpecification req, Map<String,Object> queryParam){
        return req.queryParams(queryParam);
    }
    public static RequestSpecification addPayload(RequestSpecification req,String payload){
        return req.body(payload);
    }

}
