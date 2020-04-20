package com.bl.demo;


import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validateFirstName(String firstNamePattern, String firstName){
        return Pattern.matches(firstNamePattern,firstName);
    }

}
