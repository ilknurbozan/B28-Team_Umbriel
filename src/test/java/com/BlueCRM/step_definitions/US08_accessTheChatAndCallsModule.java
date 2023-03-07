package com.BlueCRM.step_definitions;

import com.BlueCRM.pages.US01_LoginPage_Ilknur;
import com.BlueCRM.pages.US08_chatAndCallsModule_ANIL;
import com.BlueCRM.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class US08_accessTheChatAndCallsModule {
   US08_chatAndCallsModule_ANIL us08_chatAndCallsModule = new US08_chatAndCallsModule_ANIL();
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
    public void the_user_see_the_below_options(List<String>list) {



    }


}
