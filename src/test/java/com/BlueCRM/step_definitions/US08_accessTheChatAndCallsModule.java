package com.BlueCRM.step_definitions;

import com.BlueCRM.pages.US01_LoginPage_Ilknur;
import com.BlueCRM.pages.US08_chatAndCallsModule;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.DataTable;
import io.cucumber.messages.types.TableRow;

import java.util.List;

public class US08_accessTheChatAndCallsModule {
    US01_LoginPage_Ilknur us01_loginPage_ilknur=new US01_LoginPage_Ilknur();
   US08_chatAndCallsModule us08_chatAndCallsModule = new US08_chatAndCallsModule();

    @Given("users are on the homepage")
    public void users_are_on_the_homepage() {
        us01_loginPage_ilknur.login("hr1@cybertekschool.com","UserUser");
        us01_loginPage_ilknur.login.click();
    }

    @When("users click the CHAT and Calls module")
    public void users_click_the_chat_and_calls_module() {
        us08_chatAndCallsModule.chatAncCallsButton.click();
    }

    @Then("the user see the below options:")
    public void the_user_see_the_below_options(io.cucumber.datatable.DataTable dataTable) {

    }


}
