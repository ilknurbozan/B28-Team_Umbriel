package com.BlueCRM.pages;

import com.BlueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US14_AccessTheCompanyPage_Mehmet {

    public US14_AccessTheCompanyPage_Mehmet() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[@title='Company']")
    public WebElement companyPageLink;

    @FindBy(xpath = "//div[@id='top_menu_id_about']/div")
    public List<WebElement> modules;



}
