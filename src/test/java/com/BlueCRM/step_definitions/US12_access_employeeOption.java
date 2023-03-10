package com.BlueCRM.step_definitions;

import com.BlueCRM.pages.US01_LoginPage_Ilknur;
import com.BlueCRM.pages.US12_access_employeeOptionPage;
import com.BlueCRM.utilities.BrowserUtils;
import com.BlueCRM.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US12_access_employeeOption {

    US01_LoginPage_Ilknur home = new US01_LoginPage_Ilknur();

    US12_access_employeeOptionPage module = new US12_access_employeeOptionPage();

    @When("users click the Employees module")
    public void users_click_the_employees_module() {
        //home.login(ConfigurationReader.getProperty("HR_username"), ConfigurationReader.getProperty("HR_password"));
        module.employeesModule.click();
        BrowserUtils.sleep(2);



    }
    @Then("verify the users see flowing 6 options:")
    public void verify_the_users_see_flowing_options(List<String> list) {

        List<WebElement> actualList = new ArrayList<>();
        List<String> actualString = new ArrayList<String>();

        actualList.addAll(Arrays.asList( module.companyStructure,module.findEmployee, module.telephoneDirectory, module.staffChanges,
                module.efficiencyReport, module.honoredEmployees));

        for (WebElement each : actualList) {
            System.out.println("each.getAccessibleName() = " + each.getAccessibleName());
            actualString.add(each.getAccessibleName());
        }

        Assert.assertEquals(list,actualString);



    }


}
