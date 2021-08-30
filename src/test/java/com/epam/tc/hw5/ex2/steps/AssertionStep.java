package com.epam.tc.hw5.ex2.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

import java.util.List;

public class AssertionStep extends AbstractStep {

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
    public void verifyUserTableValues (DataTable listValues) {
        List <String> userInformation = listValues.asList();
        userTablePage.verifyUserInformation(userInformation);
    }

    @Then("droplist should contain values in column Type for user Roman:")
    public void verifyDroplistColumnValues(DataTable dropdownValues) {
        List<String> informationForUserRoman = dropdownValues.asList();
        userTablePage.verifyDroplistInformationForUserRoman(informationForUserRoman);
    }
}
