package com.epam.tc.hw3.pages;

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

    public void openPage(String url) {
        webDriver.navigate().to(url);
    }

    public void verifyHomePageTitle(String expectedTitle) {
        softAssertions.assertThat(expectedTitle)
                .isEqualTo(webDriver.getTitle());
    }

    public void switchToHomePage() {
        String windowHandler = webDriver.getWindowHandle();
        webDriver.switchTo().window(windowHandler);
    }
}
