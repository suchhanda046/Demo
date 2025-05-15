package com.example.steps;

import com.example.utils.TokenManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class UserLogin {
    @Then("jwt token is generated")
    public void jwt_token_is_generated() throws IOException {
        System.out.println("started...");
        TokenManager tok = new TokenManager();
        String token = tok.getToken();
        System.out.println("Login token is: "+token);
    }


}
