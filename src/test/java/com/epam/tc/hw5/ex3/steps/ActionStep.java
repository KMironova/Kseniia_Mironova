package com.epam.tc.hw5.ex3.steps;

import io.cucumber.java.en.When;

public class ActionStep extends AbstractStep {

    @When("I select 'vip' checkbox for 'Sergey Ivan'")
    public void selectVipForCheckboxIvan() {
        userTablePage.selectVipCheckboxForUserIvan();
    }
}
