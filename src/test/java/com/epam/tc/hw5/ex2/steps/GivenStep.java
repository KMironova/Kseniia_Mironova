package com.epam.tc.hw5.ex2.steps;

import com.epam.tc.hw5.ConfProperties;
import io.cucumber.java.en.Given;

public class GivenStep extends AbstractStep {

    @Given("I open JDI GitHub site")
    public void openGitHubSite() {
        gdiGitHubSite.openPage(ConfProperties.getProperty("url"));
    }

    @Given("I login as user 'Roman Iovlev'")
    public void login() {
        gdiGitHubSite.login(ConfProperties.getProperty("password"), ConfProperties.getProperty("username"));
    }
}
