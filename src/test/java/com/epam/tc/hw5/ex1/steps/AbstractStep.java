package com.epam.tc.hw5.ex1.steps;

import com.epam.tc.hw5.ex1.cucumber.context.TestContext;
import com.epam.tc.hw5.pages.DifferentPage;
import com.epam.tc.hw5.pages.GdiGitHubSite;
import com.epam.tc.hw5.pages.components.LeftSideMenuComponents;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;

public abstract class AbstractStep {

    protected static GdiGitHubSite epamPage;
    protected static LeftSideMenuComponents leftSideMenuComponents;
    protected static DifferentPage differentPage;

    protected AbstractStep () {
       WebDriver webDriver = TestContext.getInstance().getTestObject("web_driver");
       SoftAssertions softAssertions = TestContext.getInstance().getTestObject("soft_assertion");

       epamPage = new GdiGitHubSite(webDriver,softAssertions);
       leftSideMenuComponents = new LeftSideMenuComponents(webDriver,softAssertions);
    }
}
