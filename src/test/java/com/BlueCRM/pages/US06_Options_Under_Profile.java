package com.BlueCRM.pages;

import com.BlueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US06_Options_Under_Profile {

    public US06_Options_Under_Profile(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@id='user-name']")
    public WebElement profile;
    @FindBy(xpath = "//div[@class='menu-popup-items']//span[contains(@class, 'text')]")
    public List<WebElement> profileMenu;


}
