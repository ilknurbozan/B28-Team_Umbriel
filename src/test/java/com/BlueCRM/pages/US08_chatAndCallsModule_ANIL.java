package com.BlueCRM.pages;

import com.BlueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US08_chatAndCallsModule_ANIL   {

    public US08_chatAndCallsModule_ANIL(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[@class='bx-desktop-appearance-tab']//span/..")
    public List<WebElement> table;
    @FindBy(xpath = "//span[normalize-space()='Chat and Calls']")
    public WebElement chatAncCallsButton;

   // @FindBy(xpath = "//div[@class='bx-desktop-appearance-tab']")
   // public WebElement table;

    @FindBy(xpath = "//div[@title='Message(s) ']")
    public WebElement messageButton;

    @FindBy(xpath = "//div[@title='Notifications']")
    public WebElement notificationButton;

    @FindBy(xpath = "//div[@title='Settings']")
    public WebElement settingsButton;

    @FindBy(xpath = "//div[@title='Activity Stream ']")
    public WebElement activeStreamButton;



}
