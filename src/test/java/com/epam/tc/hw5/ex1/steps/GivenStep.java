package com.epam.tc.hw5.ex1.steps;

import com.epam.tc.hw5.ConfProperties;
import com.epam.tc.hw5.ex1.cucumber.context.TestContext;
import io.cucumber.java.en.Given;

public class GivenStep extends AbstractStep {

    @Given("I open Home Page")
    public void openPage() {
        epamPage.openPage(ConfProperties.getProperty("url"));
    }

    @Given("I perform login")
    public void login() {
        epamPage.login(ConfProperties.getProperty("password"), ConfProperties.getProperty("username"));
    }

    @Given("I open through the header menu Service -> Different Elements Page")
    public void openDifferentPage() {
        differentPage = leftSideMenuComponents.openDifferentPage(
            TestContext.getInstance().getTestObject("web_driver"),
            TestContext.getInstance().getTestObject("soft_assertion"));
    }
}
