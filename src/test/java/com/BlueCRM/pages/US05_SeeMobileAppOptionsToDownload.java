package com.BlueCRM.pages;

import com.BlueCRM.utilities.ConfigurationReader;
import com.BlueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US05_SeeMobileAppOptionsToDownload {

    public US05_SeeMobileAppOptionsToDownload(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "USER_LOGIN")
    public WebElement userName;


    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(className = "login-btn")
    public WebElement logInBtn;

    public void loginMethod(String userType) {

        if(userType.equalsIgnoreCase("hr")){
            userName.sendKeys(ConfigurationReader.getProperty("HR_username"));
            password.sendKeys(ConfigurationReader.getProperty("HR_password"));
            logInBtn.click();
        }else if(userType.equalsIgnoreCase("helpDesk")){
            userName.sendKeys(ConfigurationReader.getProperty("HelpDesk_username"));
            password.sendKeys(ConfigurationReader.getProperty("HelpDesk_password"));
            logInBtn.click();
        }else if(userType.equalsIgnoreCase("marketing")){
            userName.sendKeys(ConfigurationReader.getProperty("Marketing_username"));
            password.sendKeys(ConfigurationReader.getProperty("Marketing_password"));
            logInBtn.click();
        }

    }

    @FindBy(xpath = "(//div[@class='b24-app-block-content'])[2]/a")
    public List<WebElement> mobileApplicationOptions;
}
