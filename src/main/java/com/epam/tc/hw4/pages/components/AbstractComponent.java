package com.epam.tc.hw4.pages.components;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractComponent {

    protected WebDriver webDriver;
    protected SoftAssertions softAssertions;

    protected AbstractComponent (WebDriver webDriver, SoftAssertions softAssertions) {
        this.webDriver = webDriver;
        this.softAssertions = softAssertions;
        PageFactory.initElements(webDriver,this);
    }
}
