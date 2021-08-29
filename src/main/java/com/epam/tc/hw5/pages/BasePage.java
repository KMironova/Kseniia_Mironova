package com.epam.tc.hw5.pages;

import io.qameta.allure.Step;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver webDriver;
    protected SoftAssertions softAssertions;

    public BasePage(WebDriver webDriver, SoftAssertions softAssertions) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
        this.softAssertions = softAssertions;
    }

    @Step ("Open new page by the given url")
    public void openPage(String url) {
        webDriver.navigate().to(url);
    }

    @Step ("Verify that page have proper title")
    public void verifyPageTitle(String expectedTitle) {
        softAssertions.assertThat(expectedTitle)
                .isEqualTo(webDriver.getTitle());
    }

    @Step("Switch to window handler")
    public void switchToHomePage() {
        String windowHandler = webDriver.getWindowHandle();
        webDriver.switchTo().window(windowHandler);
    }
}
