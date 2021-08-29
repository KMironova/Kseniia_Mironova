package com.epam.tc.hw5.cucumber.steps;

import com.epam.tc.hw5.ConfProperties;
import io.cucumber.java.en.Given;

public class GivenStep extends AbstractStep {

    public GivenStep () {

    }

    @Given("I open Home Page")
    public void openPage () {
        epamPage.openPage(ConfProperties.getProperty("url"));
    }

    @Given("I perform login with {string} and {string}")\
    public void login(String username, String password) {
        epamPage.login(password,username);
    }

    @Given("I open through the header menu  Service -> Different Elements Page")
    public void openDifferentPage() {

    }
}
