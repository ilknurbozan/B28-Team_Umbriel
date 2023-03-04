package com.BlueCRM.step_definitions;

import com.BlueCRM.pages.US01_LoginPage_Ilknur;
import com.BlueCRM.utilities.ConfigurationReader;
import com.BlueCRM.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US01_StepDefs {
    US01_LoginPage_Ilknur login=new US01_LoginPage_Ilknur();

    @When("user use username {string} and passcode {string}")
    public void user_use_username_and_passcode(String string, String string2) {
    login.username.sendKeys(ConfigurationReader.getProperty("HR_username"));
    login.password.sendKeys(ConfigurationReader.getProperty("HR_password"));

    }
    @When("user click the login button")
    public void user_click_the_login_button() {
        login.login.click();

    }
    @Then("verify the user should be at the home page")
    public void verify_the_user_should_be_at_the_home_page() {
      String expectedUrl="Portal";
      String actualUrl= Driver.getDriver().getTitle();
        Assert.assertTrue(actualUrl.contains(expectedUrl));

    }








}
