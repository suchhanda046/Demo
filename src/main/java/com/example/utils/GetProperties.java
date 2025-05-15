package com.example.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetProperties {
    private static final Properties prop = new Properties();
    static FileInputStream fis;

    public static String getUsername() throws IOException {
        fis = new FileInputStream("src/main/resources/Configuration.properties");
        prop.load(fis);
        return prop.get("username").toString();
    }
    public static String getPassword() throws IOException {
        fis = new FileInputStream("src/main/resources/Configuration.properties");
        prop.load(fis);
        return prop.get("password").toString();
    }
    public static String getBaseURL() throws IOException {
        fis = new FileInputStream("src/main/resources/Configuration.properties");
        prop.load(fis);
        return prop.get("baseurl").toString();
    }
    public static String getLoginUrl() throws IOException {
        fis = new FileInputStream("src/main/resources/Configuration.properties");
        prop.load(fis);
        return prop.get("login-endpoint").toString();
    }
}
