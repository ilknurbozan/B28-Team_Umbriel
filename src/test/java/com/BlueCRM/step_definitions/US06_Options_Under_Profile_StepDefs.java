package com.BlueCRM.step_definitions;

import com.BlueCRM.pages.US01_LoginPage_Ilknur;
import com.BlueCRM.pages.US03_Logout_function_Mehmet;
import com.BlueCRM.pages.US06_Options_Under_Profile;
import com.BlueCRM.utilities.ConfigurationReader;
import com.BlueCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US06_Options_Under_Profile_StepDefs {

    US01_LoginPage_Ilknur home = new US01_LoginPage_Ilknur();
    US06_Options_Under_Profile profileMethod = new US06_Options_Under_Profile();


    @Given("users are on th homepage")
    public void users_are_on_th_homepage() {
        home.login(ConfigurationReader.getProperty("HR_username"), ConfigurationReader.getProperty("HR_password"));

    }

    @When("users click the profile name")
    public void users_click_the_profile_name() {
        profileMethod.profile.click();

    }

    @Then("verify the users see flowing five options:")
    public void verifyTheUsersSeeFlowingFiveOptions(List<String> expectedValues) {

        List<WebElement> actualValues = new ArrayList<>();
        actualValues.addAll(Arrays.asList(profileMethod.myProfile, profileMethod.editProfile, profileMethod.themes, profileMethod.configureNotifications, profileMethod.logout));

        List<String> actualValuesString = new ArrayList<>();

       // System.out.println("profileMethod.myProfile.getText() = " + profileMethod.myProfile.getAccessibleName());
        for (WebElement actualValue : actualValues) {
            actualValuesString.add(actualValue.getText());
            //System.out.println(actualValue.getAccessibleName());
        }

        Assert.assertEquals(expectedValues, actualValuesString);

    }
}
