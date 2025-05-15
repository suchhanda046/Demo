package com.example.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class RestAssuredUtils {
    static RequestSpecification req;

    static {
        try {
            req = RequestUtils.createSpec();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Response postRequest(String endpoint,String payload) throws IOException {
        RequestUtils.addHeaderWithoutToken(req);
        RequestUtils.addBasePath(req,endpoint);
        RequestUtils.addPayload(req,payload);
        return req.post();
    }
    public static Response postRequestWithPathparam(String endpoint, String payload, Map<String,Object> pathParam) throws IOException {
        RequestUtils.addHeaderWithoutToken(req);
        RequestUtils.addBasePath(req,endpoint);
        RequestUtils.addPayload(req,payload);
        RequestUtils.addPathParam(req,pathParam);
        return req.post();
    }
    public static Response postRequestWithQueryparam(String endpoint, String payload, Map<String,Object> queryParam) throws IOException {
        RequestUtils.addHeaderWithoutToken(req);
        RequestUtils.addBasePath(req,endpoint);
        RequestUtils.addPayload(req,payload);
        RequestUtils.addQueryParam(req,queryParam);
        return req.post();
    }
    public static Response postRequest(String endpoint, String payload, Map<String,Object> pathParam,Map<String,Object> queryParam) throws IOException {
        RequestUtils.addHeaderWithoutToken(req);
        RequestUtils.addBasePath(req,endpoint);
        RequestUtils.addPayload(req,payload);
        RequestUtils.addPathParam(req,pathParam);
        RequestUtils.addQueryParam(req,queryParam);
        return req.post();
    }

    public static Response getRequest(String endpoint,String payload) throws IOException {
        RequestUtils.addHeaderWithoutToken(req);
        RequestUtils.addBasePath(req,endpoint);
        return req.post();
    }
    public static Response getRequestWithPathparam(String endpoint, String payload, Map<String,Object> pathParam) throws IOException {
        RequestUtils.addHeaderWithoutToken(req);
        RequestUtils.addBasePath(req,endpoint);
        RequestUtils.addPathParam(req,pathParam);
        return req.post();
    }
    public static Response getRequestWithQueryparam(String endpoint, String payload, Map<String,Object> queryParam) throws IOException {
        RequestUtils.addHeaderWithoutToken(req);
        RequestUtils.addBasePath(req,endpoint);
        RequestUtils.addQueryParam(req,queryParam);
        return req.post();
    }
    public static Response getRequest(String endpoint, String payload, Map<String,Object> pathParam,Map<String,Object> queryParam) throws IOException {
        RequestUtils.addHeaderWithoutToken(req);
        RequestUtils.addBasePath(req,endpoint);
        RequestUtils.addPathParam(req,pathParam);
        RequestUtils.addQueryParam(req,queryParam);
        return req.post();
    }

}
