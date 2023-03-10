package com.BlueCRM.step_definitions;

import com.BlueCRM.pages.US13_SeeOptionsUnderConfigureMenu_page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US13_SeeOptionsUnderConfigureMenu {

    US13_SeeOptionsUnderConfigureMenu_page configureOptionPage = new US13_SeeOptionsUnderConfigureMenu_page();

    @When("user click the configure menu option")
    public void user_click_the_configure_menu_option() {

        configureOptionPage.configureMenu.click();

    }

    @Then("verify the users see  flowing six options:")
    public void verify_the_users_see_flowing_six_options(List<String> expectedOptions) {

        List<String> actualOptions = new ArrayList<>();

        for (WebElement configureOption : configureOptionPage.configureOptions) {

            actualOptions.add(configureOption.getText());
        }

        Assert.assertEquals(expectedOptions, actualOptions);

    }
}
