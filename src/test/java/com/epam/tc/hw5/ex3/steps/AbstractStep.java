package com.epam.tc.hw5.ex3.steps;

import com.epam.tc.hw5.ex1.cucumber.context.TestContext;
import com.epam.tc.hw5.pages.GdiGitHubSite;
import com.epam.tc.hw5.pages.UserTablePage;
import com.epam.tc.hw5.pages.components.HeaderComponents;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;

public abstract class AbstractStep {

    protected static GdiGitHubSite gdiGitHubSite;
    protected static UserTablePage userTablePage;
    protected static HeaderComponents headerComponents;

    protected AbstractStep () {
        WebDriver webDriver = TestContext.getInstance().getTestObject("web_driver");
        SoftAssertions softAssertions = TestContext.getInstance().getTestObject("soft_assertion");

        gdiGitHubSite = new GdiGitHubSite(webDriver,softAssertions);
        headerComponents = new HeaderComponents(webDriver,softAssertions);
        userTablePage = new UserTablePage(webDriver,softAssertions);
    }
}
