package com.BlueCRM.step_definitions;

import com.BlueCRM.pages.US01_LoginPage_Ilknur;
import com.BlueCRM.pages.US03_Logout_function_Mehmet;
import com.BlueCRM.utilities.ConfigurationReader;
import com.BlueCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US03_Logout_function_StepDefs {

    US01_LoginPage_Ilknur loginMethod = new US01_LoginPage_Ilknur();
    US03_Logout_function_Mehmet logout = new US03_Logout_function_Mehmet();


    @Given("user is already on homepage")
    public void user_is_already_on_homepage() {

        loginMethod.login(ConfigurationReader.getProperty("HR_username"), ConfigurationReader.getProperty("HR_password"));

    }

    @Given("user clicks the user profile from the homepage")
    public void user_clicks_the_user_profile_from_the_homepage() {

        logout.userProfile.click();

    }


    @Given("user click the logout option")
    public void user_click_the_logout_option() {

        logout.logoutButton.click();

    }

    @Then("user should be able to navigate back to the login page and see title as Authorization")
    public void user_should_be_able_to_navigate_back_to_the_login_page_and_see_title_as_authorization() {

            String expectedTitle = "Authorization";
            String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.equals(expectedTitle));

    }
}
