package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


public class Login {
    private String username;
    private String password;

    // No-argument constructor
    public Login() {
        // Initialization code, if necessary
    }
    // Constructor that accepts username and password
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
