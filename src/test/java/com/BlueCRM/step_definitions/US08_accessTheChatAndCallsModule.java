package com.BlueCRM.step_definitions;

import com.BlueCRM.pages.US01_LoginPage_Ilknur;
import com.BlueCRM.pages.US08_chatAndCallsModule;
import com.BlueCRM.utilities.ConfigurationReader;
import com.BlueCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.DataTable;
import io.cucumber.messages.types.TableRow;

import java.util.List;

public class US08_accessTheChatAndCallsModule {
   US08_chatAndCallsModule us08_chatAndCallsModule = new US08_chatAndCallsModule();
    US01_LoginPage_Ilknur login=new US01_LoginPage_Ilknur();

    @Given("users are on the homepage")
    public void users_are_on_the_homepage() {
        login.username.sendKeys(ConfigurationReader.getProperty("HR_username"));
        login.password.sendKeys(ConfigurationReader.getProperty("HR_password"));
        login.login.click();
    }

    @When("users click the CHAT and Calls module")
    public void users_click_the_chat_and_calls_module() {
        us08_chatAndCallsModule.chatAncCallsButton.click();
    }

    @Then("the user see the below options:")
    public void the_user_see_the_below_options(io.cucumber.datatable.DataTable dataTable) {
            String currentWindowHandle = Driver.getDriver().getWindowHandle();

    }


}
