package com.epam.tc.hw4.pages;

import io.qameta.allure.Step;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EpamInformationFrameworkPage extends BasePage {

    public EpamInformationFrameworkPage(WebDriver webDriver, SoftAssertions softAssertions) {
        super(webDriver, softAssertions);
    }

    @FindBy (css = "li.dropdown:nth-child(1) > a:nth-child(1)")
    private WebElement dropdownButtonWhereLoginFunctions;

    @FindBy(id = "name")
    private WebElement userNameFieldForLogin;

    @FindBy(id = "password")
    private WebElement passwordFieldForLogin;

    @FindBy(id = "login-button")
    private WebElement buttonForLogin;

    @FindBy(id = "user-name")
    private WebElement loginUserName;

    @FindBy(className = "icon-base")
    private WebElement iconBase;

    @FindBy(className = "icon-practise")
    private WebElement iconPractise;

    @FindBy(className = "icon-multi")
    private WebElement iconMulti;

    @FindBy(className = "icon-custom")
    private WebElement iconCustom;

    @FindBy(xpath = "//span[starts-with(text(),'To include good practices')]")
    private WebElement textUnderPractiseIcon;

    @FindBy(xpath = "//span[starts-with(text(),'To be flexible')]")
    private WebElement textUnderCustomIcon;

    @FindBy(xpath = "//span[starts-with(text(),'To be multiplatform')]")
    private WebElement textUnderMultiIcon;

    @FindBy(xpath = "//span[starts-with(text(),'Already have good')]")
    private WebElement textUnderBaseIcon;

    @FindBy(id = "frame")
    private WebElement iframe;

    @FindBy(id = "frame-button")
    private WebElement iframeButton;

    @Step ("Login to account")
    public void login(String password, String username) {
        dropdownButtonWhereLoginFunctions.click();
        userNameFieldForLogin.sendKeys(username);
        passwordFieldForLogin.sendKeys(password);
        buttonForLogin.click();
    }

    @Step ("Verify that user have proper username after login")
    public void verifyLoginUser(String usernameToVerify) {
        softAssertions.assertThat(usernameToVerify).isEqualTo(loginUserName.getText());
    }

    @Step ("Verify that image with name 'Base' is displayed on the page")
    public void verifyThatBaseIconIsDisplayed() {
        softAssertions.assertThat(iconBase.isDisplayed()).isTrue();
    }

    @Step ("Verify that image with name 'Practise' is displayed on the page")
    public void verifyThatPractiseIconIsDisplayed() {
        softAssertions.assertThat(iconPractise.isDisplayed()).isTrue();
    }

    @Step ("Verify that image with name 'Multi' is displayed on the page")
    public void verifyThatMultiIconIsDisplayed() {
        softAssertions.assertThat(iconMulti.isDisplayed()).isTrue();
    }

    @Step ("Verify that image with name 'Custom' is displayed on the page")
    public void verifyThatCustomIconIsDisplayed() {
        softAssertions.assertThat(iconCustom.isDisplayed()).isTrue();
    }

    @Step ("Verify that under image with name 'Base' has proper text")
    public void verifyThatProperTextIsUnderBaseIcon(String expectedText) {
        softAssertions.assertThat(expectedText).isEqualTo(textUnderBaseIcon.getText());
    }

    @Step ("Verify that under image with name 'Practise' has proper text")
    public void verifyThatProperTextIsUnderPractiseIcon(String expectedText) {
        softAssertions.assertThat(expectedText).isEqualTo(textUnderPractiseIcon.getText());
    }

    @Step ("Verify that under image with name 'Multi' has proper text")
    public void verifyThatProperTextIsUnderMultiIcon(String expectedText) {
        softAssertions.assertThat(expectedText).isEqualTo(textUnderMultiIcon.getText());
    }

    @Step ("Verify that under image with name 'Custom' has proper text")
    public void verifyThatProperTextIsUnderCustomIcon(String expectedText) {
        softAssertions.assertThat(expectedText).isEqualTo(textUnderCustomIcon.getText());
    }

    @Step ("Verify that iframe with button is exist")
    public void verifyIframeExist() {
        softAssertions.assertThat(iframe.isDisplayed()).isTrue();
    }

    @Step ("Verify that button on iframe is exist")
    public void verifyThatButtonExistOnIframe() {
        webDriver.switchTo().frame("frame");
        softAssertions.assertThat(iframeButton.isDisplayed()).isTrue();
    }
}
