package com.epam.tc.hw5.pages;

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

    @FindBy(linkText = "HOME")
    private WebElement elementHomeOnNavigationBar;

    @FindBy(linkText = "CONTACT FORM")
    private WebElement elementContactsOnNavigationBar;

    @FindBy(linkText = "SERVICE")
    private WebElement elementServiceOnNavigationBar;

    @FindBy(linkText = "METALS & COLORS")
    private WebElement elementMetalsAndColorsOnNavigationBar;

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

    @FindBy(xpath = "//span[text() = 'Home']")
    private WebElement homeElementOnLeftSideMenu;

    @FindBy(xpath = "//span[text() = 'Service']")
    private WebElement serviceElementOnLeftSideMenu;

    @FindBy(xpath = "//span[text() = 'Contact form']")
    private WebElement contactsElementOnLeftSideMenu;

    @FindBy(xpath = "//span[text() = 'Metals & Colors']")
    private WebElement metalsAndColorsElementOnLeftSideMenu;

    @FindBy(xpath = "//span[text() = 'Elements packs']")
    private WebElement elementsPacksElementOnLeftSideMenu;

    @FindBy(xpath = "//span[text() = 'Different elements']")
    private WebElement differentPage;

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

    @Step ("Verify that on header element with name 'HOME' have proper text")
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

    @Step ("Verify that on left side menu element with name 'Home' have proper text")
    public void verifyHomeElementNameOnLeftSideMenu(String expectedName) {
        softAssertions.assertThat(expectedName).isEqualTo(homeElementOnLeftSideMenu.getText());
    }

    @Step ("Verify that on left side menu element with name 'Service' have proper text")
    public void verifyServiceElementNameOnLeftSideMenu(String expectedName) {
        softAssertions.assertThat(expectedName).isEqualTo(serviceElementOnLeftSideMenu.getText());
    }

    @Step ("Verify that on left side menu element with name 'Contact' have proper text")
    public void verifyContactElementNameOnLeftSideMenu(String expectedName) {
        softAssertions.assertThat(expectedName).isEqualTo(contactsElementOnLeftSideMenu.getText());
    }

    @Step ("Verify that on left side menu element with name 'Metals & Colors' have proper text")
    public void verifyMetalsAndColorsElementNameOnLeftSideMenu(String expectedName) {
        softAssertions.assertThat(expectedName).isEqualTo(metalsAndColorsElementOnLeftSideMenu.getText());
    }

    @Step ("Verify that on left side menu element with name 'Element Packs' have proper text")
    public void verifyElementPacksElementNameOnLeftSideMenu(String expectedName) {
        softAssertions.assertThat(expectedName).isEqualTo(elementsPacksElementOnLeftSideMenu.getText());
    }

    @Step ("Open page with name 'Different Page'")
    public DifferentPage openDifferentPage() {
        serviceElementOnLeftSideMenu.click();
        differentPage.click();
        return new DifferentPage(webDriver, softAssertions);
    }
}
