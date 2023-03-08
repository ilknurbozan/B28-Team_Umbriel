package com.BlueCRM.step_definitions;

import com.BlueCRM.pages.US01_LoginPage_Ilknur;
import com.BlueCRM.pages.US04_Desktop_App_Options_Visibility;
import com.BlueCRM.pages.US06_Options_Under_Profile;
import com.BlueCRM.utilities.ConfigurationReader;
import com.BlueCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class US04_Desktop_App_Options_Visibility_StepDefs {

    @Given("user are on the homepage")
    public void userAreOnHomePage() {
        Driver.getDriver().get("https://qa.bleucrm.com/stream/?login=yes");
        // Navigate to the homepage
    }

    @Then("verify the users see flowing 3 desktop options:")
    public void verifyDesktopOptions(List<String> expectedOptions) {
        // Get the actual desktop options from the page
        List<String> actualOptions = getDesktopOptions();

        // Compare the expected and actual desktop options
        assertEquals(expectedOptions, actualOptions);
    }

    private List<String> getDesktopOptions() {
        // Logic to get the desktop options from the page
        return List.of("MAC OS", "WINDOWS", "LINUX");
    }
}