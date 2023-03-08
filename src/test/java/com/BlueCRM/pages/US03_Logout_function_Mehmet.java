package com.BlueCRM.pages;

import com.BlueCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US03_Logout_function_Mehmet {

    public US03_Logout_function_Mehmet(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//span[text()='hr1@cybertekschool.com']")
    public WebElement userProfile;

    @FindBy(xpath = "//span[text()='Log out']")
    public WebElement logoutButton;





}
