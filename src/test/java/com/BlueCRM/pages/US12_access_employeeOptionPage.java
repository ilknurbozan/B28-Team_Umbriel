package com.BlueCRM.pages;

import com.BlueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.XMLFormatter;

public class US12_access_employeeOptionPage {

    public US12_access_employeeOptionPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    //@FindBy (xpath = "(//span[@class='menu-item-link-text'])[7]")

    //@FindBy (xpath = "(//span[@data-role='item-text'])[7]")
   // @FindBy (xpath = "(//a[@class='menu-item-link'])[7]")
    @FindBy (xpath = "//li[@id='bx_left_menu_menu_company']")
    public WebElement employeesModule;

    @FindBy(xpath = "//div[@id='top_menu_id_company']") //inner container

    //@FindBy(xpath = "//div[@class='main-buttons']")
    public WebElement mainButtons;

    @FindBy (xpath = "(//a[@class='main-buttons-item-link'])[1]")
    public WebElement companyStructure;

    @FindBy (xpath = "(//a[@class='main-buttons-item-link'])[2]")
    public  WebElement findEmployee;

    @FindBy (xpath = "(//a[@class='main-buttons-item-link'])[3]")
    public WebElement telephoneDirectory;

    @FindBy (xpath = "(//a[@class='main-buttons-item-link'])[4]")
    public  WebElement staffChanges;

    @FindBy (xpath = "(//a[@class='main-buttons-item-link'])[5]")
    public WebElement efficiencyReport;

    @FindBy (xpath = "(//a[@class='main-buttons-item-link'])[6]")
    public WebElement honoredEmployees;
}
