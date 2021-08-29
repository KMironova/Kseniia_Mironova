package com.epam.tc.hw5.ex2.steps;

import com.epam.tc.hw5.ex1.cucumber.context.TestContext;
import io.cucumber.java.en.When;

public class ActionStep extends AbstractStep {

    @When("I click on 'Service' button in Header")
    public void clickServiceInHeader() {
        headerComponents.clickService();
    }

    @When("I click on 'User Table' button in Service dropdown")
    public void clickUserTableInServiceDropdown() {
        userTablePage = headerComponents.clickUserTableInServiceInDropdown(
            TestContext.getInstance().getTestObject("web_driver"),
            TestContext.getInstance().getTestObject("soft_assertion")
        );
    }
}
