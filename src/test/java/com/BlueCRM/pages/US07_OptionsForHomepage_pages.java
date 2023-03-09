package com.BlueCRM.pages;

import com.BlueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US07_OptionsForHomepage_pages {

    public US07_OptionsForHomepage_pages(){PageFactory.initElements(Driver.getDriver(), this);}


    @FindBy(id="feed-add-post-form-link-text")
    public WebElement more;

   @FindBy(id = "menu-popup-items")
   public WebElement dropdown;
}

