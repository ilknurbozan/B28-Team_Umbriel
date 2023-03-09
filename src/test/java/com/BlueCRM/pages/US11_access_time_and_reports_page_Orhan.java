package com.BlueCRM.pages;

import com.BlueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US11_access_time_and_reports_page_Orhan {
    public US11_access_time_and_reports_page_Orhan() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[normalize-space()='Time and Reports']")
    public WebElement timeAndReportsMenu;

    @FindBy(xpath ="//span[@class='main-buttons-item-text-title']")
    public List<WebElement> timeAndReportsModule;
}
