package com.epam.tc.hw5.ex1.steps;

import io.cucumber.java.en.Then;

public class AssertionStep extends AbstractStep {

    @Then("for checkbox 'Water' there is an individual log row and value is corresponded to the status of checkbox")
    public void verifyCheckboxSelectedWater() {
        differentPage.verifySelectedCheckBoxWater();
    }

    @Then("for checkbox 'Wind' there is an individual log row and value is corresponded to the status of checkbox")
    public void verifySelectedCheckboxWind () {
        differentPage.verifySelectedCheckBoxWind();
    }

    @Then("for radio button there is a log row and value is corresponded to the status of radio button")
    public void verifyRadioSelected() {
        differentPage.verifySelectedRadioSelen();
    }

    @Then("for dropdown there is a log row and value is corresponded to the selected value")
    public void verifyDropdownSelected() {
        differentPage.verifySelectedDropDownYellow();
    }
}
