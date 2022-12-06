package com.herokuapp.testsuite;

import com.herokuapp.pages.LoginPage;
import com.herokuapp.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //login with valid username
        loginPage.usernameFields("tomsmith");

        //login with valid password
        loginPage.passwordField("SuperSecretPassword!");

        //Click on login button
        loginPage.clickLoginButton();

        //verify secure area
        String expectedText  = "Secure Area";
        Assert.assertEquals(loginPage.getSecureAreaMessage(),expectedText,"message not displayed");


    }
    @Test
    public void verifyTheUsernameErrorMessage(){
        //login with valid username
        loginPage.usernameFields("tomsmith1");

        //login with valid password
        loginPage.passwordField("SuperSecretpassword!");

        //Click on login button
        loginPage.clickLoginButton();

        String expectedMessage =  "Your username is invalid!\n" +
                "×";
        Assert.assertEquals(loginPage.usernameError(),expectedMessage,"Message not displayed");

    }

    @Test
    public void verifyThePasswordErrorMessage(){
        // enter username
        loginPage.usernameFields("tomsmith");

        // Login with valid password
        loginPage.passwordField("SuperSecretPassword");

        // Click on login button
        loginPage.clickLoginButton();

        // Check valid message display or not
        loginPage.clickLoginButton();

        String expectedMessage =  "Your username is invalid!\n" +
                "×";
        Assert.assertEquals(loginPage.usernameError(),expectedMessage,"Message not displayed");



    }


}
