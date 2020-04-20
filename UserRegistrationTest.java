package com.bl.demo;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration object = new UserRegistration();
    @Test
    public void checkName(){
        Assert.assertTrue(object.validateName("^[A-Z]{1}[a-z]{2,}[ ][A-Z]{1}[a-z]{2,}$","Kaneki ken"));
    }
    @Test
    public void Email(){
        Assert.assertTrue(object.validateName("^[a-zA-Z0-9]+[\\.\\-\\+\\_]?[a-zA-Z0-9]*@[a-zA-Z]+[.]?[a-zA-Z]{2,4}[\\.]?([a-z]{2})?$","Kaneki.ken@gmail.com.in"));
    }
    @Test
    public void phoneNumber(){
        Assert.assertTrue(object.validateName("^[0-9]{2}[ ][0-9]{10}$","91 1234567809"));
    }


}
