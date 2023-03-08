package com.BlueCRM.pages;

import com.BlueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US09_my_profile_page_Orhan {

    public US09_my_profile_page_Orhan() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id='user-name']")
    public WebElement userNameBlock;

    @FindBy(xpath = "//span[@class='menu-popup-item-text']")
    public WebElement myProfile;

    @FindBy(xpath = "//div[@class='profile-menu-items']/a")
    public List<WebElement> myProfileMenu;

}
