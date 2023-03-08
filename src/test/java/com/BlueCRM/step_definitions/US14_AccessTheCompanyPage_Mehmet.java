package com.BlueCRM.step_definitions;

import com.BlueCRM.pages.US01_LoginPage_Ilknur;
import com.BlueCRM.pages.US03_Logout_function_Mehmet;
import com.BlueCRM.utilities.BrowserUtils;
import com.BlueCRM.utilities.ConfigurationReader;
import com.BlueCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import javax.swing.text.Utilities;
import java.util.ArrayList;
import java.util.List;

public class US14_AccessTheCompanyPage_Mehmet {
    US01_LoginPage_Ilknur loginMethod = new US01_LoginPage_Ilknur();
    com.BlueCRM.pages.US14_AccessTheCompanyPage_Mehmet companyPage = new com.BlueCRM.pages.US14_AccessTheCompanyPage_Mehmet();




  /*  @Given("user is already on homepage")
    public void user_is_already_on_homepage() {

        loginMethod.login(ConfigurationReader.getProperty("HR_username"), ConfigurationReader.getProperty("HR_password"));

    }

   */





    @Given("user clicks the Company page")
    public void user_clicks_the_company_page() {




       companyPage.companyPageLink.click();



    }

    @Then("users should see seven modules in the Company page")
    public void usersShouldSeeSevenModulesInTheCompanyPage(List<String> expectedModules) {




        List<String> actualModules = new ArrayList<>();


        for (WebElement each : companyPage.modules) {
            if (!(each.getText().contains("More"))){

                actualModules.add(each.getText());


            }

        }

        Assert.assertEquals(expectedModules,actualModules);

        // Ask Alvin on tomorrow's daily stand-up meeting
        //1# How to make browser page smaller, it doesn't see the 7th module on given page
        //2# Empty space on the Assertion is it bug? What to do ?




    }

}
