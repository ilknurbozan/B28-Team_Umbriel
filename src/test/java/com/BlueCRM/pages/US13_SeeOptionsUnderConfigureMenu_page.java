package com.BlueCRM.pages;

import com.BlueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US13_SeeOptionsUnderConfigureMenu_page {

    public US13_SeeOptionsUnderConfigureMenu_page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "left-menu-settings")
    public WebElement configureMenu;

@FindBy(xpath = "//div[@class='menu-popup-items']//span[contains(@class,'item-text')]")
    public List<WebElement>  configureOptions;

}
