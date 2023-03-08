package com.BlueCRM.pages;

import com.BlueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US02_login_checkboxPage {
    public US02_login_checkboxPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//label[@class='login-item-checkbox-label']")

    public WebElement loginCheckbox;

    @FindBy(id = "USER_REMEMBER")

    public WebElement clickAbleBox;
}
