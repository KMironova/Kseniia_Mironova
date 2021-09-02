package com.epam.tc.hw5.steps;

import com.epam.tc.hw5.cucumber.context.TestContext;
import com.epam.tc.hw5.pages.DifferentPage;
import com.epam.tc.hw5.pages.GdiGitHubSite;
import com.epam.tc.hw5.pages.UserTablePage;
import com.epam.tc.hw5.pages.components.HeaderComponents;
import com.epam.tc.hw5.pages.components.LeftSideMenuComponents;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;

public abstract class AbstractStep {

    protected static GdiGitHubSite gdiGitHubSite;
    protected static HeaderComponents headerComponents;
    protected static UserTablePage userTablePage;
    protected static LeftSideMenuComponents leftSideMenuComponents;
    protected static DifferentPage differentPage;

    protected AbstractStep() {
        WebDriver webDriver = TestContext.getInstance().getTestObject("web_driver");
        SoftAssertions softAssertions = TestContext.getInstance().getTestObject("soft_assertion");

        gdiGitHubSite = new GdiGitHubSite(webDriver, softAssertions);
        headerComponents = new HeaderComponents(webDriver, softAssertions);
        leftSideMenuComponents = new LeftSideMenuComponents(webDriver, softAssertions);
    }
}
