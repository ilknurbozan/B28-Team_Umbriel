package com.BlueCRM.pages;

import com.BlueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US06_Options_Under_Profile {

    public US06_Options_Under_Profile(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@id='user-name']")
    public WebElement profile;

    @FindBy(xpath = "//span[text()='My Profile']")
    public WebElement myProfile;

    @FindBy(xpath = "//span[text()='Edit Profile Settings']")
    public WebElement editProfile;

    @FindBy(xpath = "//span[text()='Themes']")
    public WebElement themes;

    @FindBy(xpath = "//span[text()='Configure notifications']")
    public WebElement configureNotifications;

    @FindBy(xpath = "//span[text()='Log out']")
    public WebElement logout;


}
