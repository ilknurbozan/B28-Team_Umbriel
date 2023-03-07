package com.BlueCRM.pages;


import com.BlueCRM.utilities.ConfigurationReader;
import com.BlueCRM.utilities.Driver;
//import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US01_LoginPage_Ilknur {

    public US01_LoginPage_Ilknur() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement username;


    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(className = "login-btn")
    public WebElement login;


   public void login(String userNameStr, String passwordStr) {

      
       username.sendKeys(userNameStr);
       password.sendKeys(passwordStr);
       login.click();

    }



}


