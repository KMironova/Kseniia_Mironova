package com.epam.tc.hw5.steps;

import com.epam.tc.hw5.cucumber.context.TestContext;
import io.cucumber.java.en.When;

public class ActionStep extends AbstractStep {

    @When ("I select checkbox 'Water'")
    public void selectCheckboxWater() {
        differentPage.selectCheckBoxWater();
    }

    @When ("I select checkbox 'Wind'")
    public void selectCheckBoxWind() {
        differentPage.selectCheckBoxWind();
    }

    @When ("I select radio 'Selen'")
    public void selectRadioSelen() {
        differentPage.selectRadioSelen();
    }

    @When ("I select 'Yellow' from dropdown list")
    public void selectDropdownYellow() {
        differentPage.selectDropDownYellow();
    }

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

    @When("I select 'vip' checkbox for 'Sergey Ivan'")
    public void selectVipForCheckboxIvan() {
        userTablePage.selectVipCheckboxForUserIvan();
    }
}
