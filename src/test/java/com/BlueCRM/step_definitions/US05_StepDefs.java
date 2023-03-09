package com.BlueCRM.step_definitions;

import com.BlueCRM.pages.US05_SeeMobileAppOptionsToDownload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US05_StepDefs {

    US05_SeeMobileAppOptionsToDownload mobileApps = new US05_SeeMobileAppOptionsToDownload();

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        mobileApps.loginMethod("hr");
    }

    @Then("verify the user sees following mobile app options:")
    public void verify_the_users_see_flowing_mobile_app_options(List<String> expectedOptions) {
        List<WebElement> mobileAppOpts = mobileApps.mobileApplicationOptions;
        List<String> actualOptions = new ArrayList<>();

        for (WebElement eachOption : mobileAppOpts) {
            actualOptions.add(eachOption.getText());
        }

        Assert.assertEquals(expectedOptions, actualOptions);
    }
}
