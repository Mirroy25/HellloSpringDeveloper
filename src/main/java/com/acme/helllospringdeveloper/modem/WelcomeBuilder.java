package com.acme.helllospringdeveloper.modem;

public class WelcomeBuilder {
    private static final String WELCOME_TEMPLATE = "Hello. Now you are a Spring Developer"
    public static String build (string name){
        String finalname = name == null ? "Developer" : name;
        return String.format(WELCOME_TEMPLATE,finalname);
    }
}
