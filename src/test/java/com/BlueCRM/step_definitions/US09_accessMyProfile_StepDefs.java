package com.BlueCRM.step_definitions;

import com.BlueCRM.pages.US01_LoginPage_Ilknur;
import com.BlueCRM.pages.US09_my_profile_page_Orhan;
import com.BlueCRM.utilities.BrowserUtils;
import com.BlueCRM.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US09_accessMyProfile_StepDefs {

    US01_LoginPage_Ilknur loginMethod = new US01_LoginPage_Ilknur();
    US09_my_profile_page_Orhan accessMyProfile = new US09_my_profile_page_Orhan();

    @Given("user is already on the home page")
    public void user_is_already_on_the_home_page() {
        loginMethod.login(ConfigurationReader.getProperty("HR_username"), ConfigurationReader.getProperty("HR_password"));
    }

    @Then("user clicks to username block")
    public void user_clicks_to_user_block() {
        accessMyProfile.userNameBlock.click();
    }

    @Then("user clicks to my profile section")
    public void user_clicks_to_my_profile_section() {
        accessMyProfile.myProfile.click();
    }

    @Then("user should see five options are displayed")
    public void user_should_see_five_options_are_displayed(List<String> expectedList) {
        List<String> actualList = new ArrayList<>();
        for (WebElement each : accessMyProfile.myProfileMenu) {
            actualList.add(each.getText());
        }
        Assert.assertEquals(expectedList, actualList);
    }
}
