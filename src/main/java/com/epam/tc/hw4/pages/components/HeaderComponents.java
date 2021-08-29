package com.epam.tc.hw4.pages.components;

import io.qameta.allure.Step;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderComponents extends AbstractComponent {

    public  HeaderComponents (WebDriver webDriver, SoftAssertions softAssertions) {
        super(webDriver,softAssertions);
    }

    @FindBy(linkText = "HOME")
    private WebElement elementHomeOnNavigationBar;

    @FindBy(linkText = "CONTACT FORM")
    private WebElement elementContactsOnNavigationBar;

    @FindBy(linkText = "SERVICE")
    private WebElement elementServiceOnNavigationBar;

    @FindBy(linkText = "METALS & COLORS")
    private WebElement elementMetalsAndColorsOnNavigationBar;

    @Step("Verify that on header element with name 'HOME' have proper text")
    public void verifyHomeElementNameOnHeader(String expectedItemText) {
        softAssertions.assertThat(expectedItemText).isEqualTo(elementHomeOnNavigationBar.getText());
    }

    @Step ("Verify that on header element with name 'CONTACTS FORM' have proper text")
    public void verifyContactsElementNameOnHeader(String expectedItemText) {
        softAssertions.assertThat(expectedItemText).isEqualTo(elementContactsOnNavigationBar.getText());
    }

    @Step ("Verify that on header element with name 'SERVICE' have proper text")
    public void verifyServiceElementNameOnHeader(String expectedItemText) {
        softAssertions.assertThat(expectedItemText).isEqualTo(elementServiceOnNavigationBar.getText());
    }

    @Step ("Verify that on header element with name 'COLORS & METALS' have proper text")
    public void verifyColorsAndMetalsElementNameOnHeader(String expectedItemText) {
        softAssertions.assertThat(expectedItemText).isEqualTo(elementMetalsAndColorsOnNavigationBar.getText());
    }
}
