package com.epam.tc.hw5.pages.components;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {

    protected WebDriver webDriver;
    protected SoftAssertions softAssertions;
    protected WebDriverWait wait;

    protected AbstractComponent(WebDriver webDriver, SoftAssertions softAssertions) {
        this.webDriver = webDriver;
        this.softAssertions = softAssertions;
        PageFactory.initElements(webDriver, this);
        wait = new WebDriverWait(webDriver, 10L);
    }
}
