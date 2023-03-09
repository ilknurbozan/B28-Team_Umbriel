package com.BlueCRM.step_definitions;

import com.BlueCRM.pages.US01_LoginPage_Ilknur;
import com.BlueCRM.pages.US07_OptionsForHomepage_pages;
import com.BlueCRM.utilities.BrowserUtils;
import com.BlueCRM.utilities.ConfigurationReader;
import com.BlueCRM.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US07_OptionsForHomepage {
    US07_OptionsForHomepage_pages optionsForHomepagePages = new US07_OptionsForHomepage_pages();

    @When("users click the MORE tab")
    public void users_click_the_more_tab() {
        optionsForHomepagePages.more.click();
        BrowserUtils.sleep(2);
    }



    @Then("verify the users see flowing four options:")

        public void verify_the_users_see_flowing_options(List<String> expectedList) {

            List<WebElement> actualResult = Driver.getDriver().findElements(By.xpath("//div[@class='menu-popup-items']/*"));
            List<String> actualResultList = new ArrayList<>();

            for (WebElement each : actualResult) {

                actualResultList.add(each.getText());


            }

            Assert.assertEquals(expectedList, actualResultList);
    }
}






