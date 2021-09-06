package com.epam.tc.hw5.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

import java.util.List;

public class AssertionStep extends AbstractStep {

    @Then("for checkbox 'Water' there is an individual log row and value is corresponded to the status of checkbox")
    public void verifyCheckboxSelectedWater() {
        differentPage.verifySelectedCheckBoxWater();
    }

    @Then("for checkbox 'Wind' there is an individual log row and value is corresponded to the status of checkbox")
    public void verifySelectedCheckboxWin() {
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

    @Then("{string} page should be opened")
    public void verifyUserTablePageOpen(String title) {
        userTablePage.verifyPageTitle(title);
    }

    @Then("6 Number Type Dropdowns should be displayed on Users Table on User Table Page")
    public void verifyDisplayedTypeDropdowns() {
        userTablePage.verifyNumberTypesIsDisplayed();
    }

    @Then("6 Usernames should be displayed on Users Table on User Table Page")
    public void verifyDisplayedUsernames() {
        userTablePage.verifyUsernamesIsDisplayed();
    }

    @Then("6 Description texts under images should be displayed on Users Table on User Table Page")
    public void verifyDisplayedDescription() {
        userTablePage.verifyDisplayedDescription();
    }

    @Then("6 checkboxes should be displayed on Users Table on User Table Page")
    public void verifyDisplayedCheckboxes() {
        userTablePage.verifyDisplayedCheckboxes();
    }

    @Then("User table should contain following values:")
    public void verifyUserTableValues(DataTable listValues) {
        List<String> userInformation = listValues.asList();
        userTablePage.verifyUserInformation(userInformation);
    }

    @Then("droplist should contain values in column Type for user Roman:")
    public void verifyDroplistColumnValues(DataTable dropdownValues) {
        List<String> informationForUserRoman = dropdownValues.asList();
        userTablePage.verifyDroplistInformationForUserRoman(informationForUserRoman);
    }

    @Then("I log row has \"Vip: condition changed to true\" text in log section")
    public void verifyVipLog() {
        userTablePage.verifyLogForCheckboxIsDisplayed();
    }
}
