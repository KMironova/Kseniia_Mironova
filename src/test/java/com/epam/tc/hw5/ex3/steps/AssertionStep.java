package com.epam.tc.hw5.ex3.steps;

import io.cucumber.java.en.Then;

public class AssertionStep extends AbstractStep {

    @Then("I log row has \"Vip: condition changed to true\" text in log section")
    public void verifyVipLog() {
        userTablePage.verifyLogForCheckboxIsDisplayed();
    }
}
