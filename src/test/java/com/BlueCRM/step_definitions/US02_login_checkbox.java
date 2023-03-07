package com.BlueCRM.step_definitions;

import com.BlueCRM.pages.US01_LoginPage_Ilknur;
import com.BlueCRM.pages.US02_login_checkboxPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US02_login_checkbox {
    US02_login_checkboxPage loginInfo02 = new US02_login_checkboxPage();
    @Given("the users go to the login page")
    public void the_users_go_to_the_login_page() {


    }
    @Then("Verify there is a “Remember me on this computer” message displayed")
    public void verify_there_is_a_remember_me_on_this_computer_message_displayed() {
        loginInfo02.loginCheckbox.isDisplayed();

    }
    @Then("verify the check box is clickable")
    public void verify_the_check_box_is_clickable() {
        loginInfo02.clickAbleBox.isSelected();

    }

}
