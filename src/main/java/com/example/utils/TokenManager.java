package com.example.utils;

import com.example.pojo.Login;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;

public class TokenManager {
    private static String token;
    RequestSpecification req = RestAssured.given();
    Login login = new Login("johnd","m38rmF$");
    String payload = JsonUtils.toJson(login);
    public String getToken() throws IOException {
        if(token==null){
            Response res =  RestAssuredUtils.postRequest(GetProperties.getLoginUrl(),payload);
            token = res.jsonPath().getString("token");
            return token;
        }
        return token;
    }
}
