package com.epam.tc.hw5.steps;

import com.epam.tc.hw5.ConfProperties;
import com.epam.tc.hw5.cucumber.context.TestContext;
import io.cucumber.java.en.Given;

public class GivenStep extends AbstractStep {

    @Given("I open through the header menu Service -> Different Elements Page")
    public void openDifferentPage() {
        differentPage = leftSideMenuComponents.openDifferentPage(
                TestContext.getInstance().getTestObject("web_driver"),
                TestContext.getInstance().getTestObject("soft_assertion"));
    }

    @Given("I open JDI GitHub site")
    public void openGitHubSite() {
        gdiGitHubSite.openPage(ConfProperties.getProperty("url"));
    }

    @Given("I login as user 'Roman Iovlev'")
    public void login() {
        gdiGitHubSite.login(ConfProperties.getProperty("password"), ConfProperties.getProperty("username"));
    }

    @Given("I click on \"Service\" button in Header")
    public void clickServiceInHeader() {
        headerComponents.clickService();
    }

    @Given("I click on \"User Table\" button in Service dropdown")
    public void clickUserTableInServiceDropdown() {
        userTablePage = headerComponents.clickUserTableInServiceInDropdown(
                TestContext.getInstance().getTestObject("web_driver"),
                TestContext.getInstance().getTestObject("soft_assertion")
        );
    }
}
