package com.herokuapp.pages;

import com.herokuapp.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility{

    By enterUsername = By.id("username");
    public void usernameFields(String email){
        sendTextToElement(enterUsername,email);
    }

    By enterPassword = By.id("password");
    public void passwordField(String password){
        sendTextToElement(enterPassword,password);
    }
    By clickLogin = By.xpath("//button[@class='radius']");
    public void clickLoginButton(){
        clickOnElement(clickLogin);
    }
    By passwordErrorMessage = By.xpath("//div[@class= 'flash error']");
    public String passwordError(){
        return getTextFromElement(passwordErrorMessage);
    }
    By usernameInvalidMessage = By.xpath("//div[@id='flash']");
    public String usernameError(){
        return getTextFromElement(usernameInvalidMessage);
    }
    By secureAreaText = By.xpath("//h2[normalize-space()='Secure Area']");
    public String getSecureAreaMessage(){
        return getTextFromElement(secureAreaText);
    }

}
