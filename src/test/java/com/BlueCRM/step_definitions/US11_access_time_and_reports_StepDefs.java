package com.BlueCRM.step_definitions;

import com.BlueCRM.pages.US11_access_time_and_reports_page_Orhan;
import com.BlueCRM.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US11_access_time_and_reports_StepDefs {

    US11_access_time_and_reports_page_Orhan accessTimeAndReports = new US11_access_time_and_reports_page_Orhan();

    @Given("user clicks to time and reports module")
    public void user_clicks_to_time_and_reports_module() {
        accessTimeAndReports.timeAndReportsMenu.click();
        BrowserUtils.sleep(1);
    }
    @Then("user should see five options are displayed below")
    public void user_should_see_five_options_are_displayed_below(List<String> expectedMenuList) {
        List<String> actualMenuList = new ArrayList<>();
        for (WebElement each: accessTimeAndReports.timeAndReportsModule) {
            actualMenuList.add(each.getText());
        }
        Assert.assertEquals(expectedMenuList,actualMenuList);

    }

}
