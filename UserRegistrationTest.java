package com.bl.demo;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration object = new UserRegistration();
    @Test
    public void checkName(){
        Assert.assertTrue(object.validateName("^[A-Z]{1}[a-z]{2,}[ ][A-Z]{1}[a-z]{2,}$","Kunal Deshmukh"));
    }
}
