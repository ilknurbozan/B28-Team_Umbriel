package com.BlueCRM.pages;

import com.BlueCRM.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;

public class US04_Desktop_App_Options_Visibility {

    public US04_Desktop_App_Options_Visibility(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[normalize-space()='Mac OS']")
    public WebElement MAC_OS;

    @FindBy(xpath = "//span[normalize-space()='Windows']")
    public WebElement WINDOWS;

    @FindBy(xpath = "//span[normalize-space()='Linux']")
    public WebElement LINUX;




}
