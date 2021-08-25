package com.epam.tc.hw3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EpamInformationFrameworkPage extends BasePage{

    public EpamInformationFrameworkPage(WebDriver webDriver) {
        super(webDriver);
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

    @FindBy (xpath = "//span[starts-with(text(),'To be multiplatform")
    private WebElement textUnderMultiIcon;

    @FindBy (xpath = "//span[starts-with(text(),'Already have good')]")
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

    public void login(String password, String username) {
        dropdownButtonWhereLoginFunctions.click();
        userNameFieldForLogin.sendKeys(username);
        passwordFieldForLogin.sendKeys(password);
        buttonForLogin.click();
    }

    public void verifyLoginUser(String usernameToVerify) {
        softAssertions.assertThat(usernameToVerify).isEqualTo(loginUserName.getText());
    }

    public void verifyHomeElementNameOnHeader(String expectedItemText) {
        softAssertions.assertThat(expectedItemText).isEqualTo(elementHomeOnNavigationBar.getText());
    }

    public void verifyContactsElementNameOnHeader(String expectedItemText) {
        softAssertions.assertThat(expectedItemText).isEqualTo(elementContactsOnNavigationBar.getText());
    }

    public void verifyServiceElementNameOnHeader(String expectedItemText) {
        softAssertions.assertThat(expectedItemText).isEqualTo(elementServiceOnNavigationBar.getText());
    }

    public void verifyColorsAndMetalsElementNameOnHeader(String expectedItemText) {
        softAssertions.assertThat(expectedItemText).isEqualTo(elementMetalsAndColorsOnNavigationBar.getText());
    }

    public void verifyThatBaseIconIsDisplayed() {
        softAssertions.assertThat(iconBase.isDisplayed()).isTrue();
    }

    public void verifyThatPractiseIconIsDisplayed() {
        softAssertions.assertThat(iconPractise.isDisplayed()).isTrue();
    }

    public void verifyThatMultiIconIsDisplayed() {
        softAssertions.assertThat(iconMulti.isDisplayed()).isTrue();
    }

    public void verifyThatCustomIconIsDisplayed() {
        softAssertions.assertThat(iconCustom.isDisplayed()).isTrue();
    }

    public void verifyThatProperTextIsUnderBaseIcon(String expectedText) {
        softAssertions.assertThat(expectedText).isEqualTo(textUnderBaseIcon);
    }

    public void verifyThatProperTextIsUnderPractiseIcon(String expectedText) {
        softAssertions.assertThat(expectedText).isEqualTo(textUnderPractiseIcon);
    }

    public void verifyThatProperTextIsUnderMultiIcon(String expectedText) {
        softAssertions.assertThat(expectedText).isEqualTo(textUnderMultiIcon);
    }

    public void verifyThatProperTextIsUnderCustomIcon(String expectedText) {
        softAssertions.assertThat(expectedText).isEqualTo(textUnderCustomIcon);
    }

    public void verifyIframeExist() {
        softAssertions.assertThat(iframe.isDisplayed()).isTrue();
    }

    public void verifyThatButtonExistOnIframe() {
        webDriver.switchTo().frame("frame");
        softAssertions.assertThat(iframeButton.isDisplayed()).isTrue();
    }

    public void verifyHomeElementNameOnLeftSideMenu(String expectedName) {
        softAssertions.assertThat(expectedName).isEqualTo(homeElementOnLeftSideMenu.getText());
    }

    public void verifyServiceElementNameOnLeftSideMenu(String expectedName) {
        softAssertions.assertThat(expectedName).isEqualTo(serviceElementOnLeftSideMenu.getText());
    }

    public void verifyContactElementNameOnLeftSideMenu(String expectedName) {
        softAssertions.assertThat(expectedName).isEqualTo(contactsElementOnLeftSideMenu.getText());
    }

    public void verifyMetalsAndColorsElementNameOnLeftSideMenu(String expectedName) {
        softAssertions.assertThat(expectedName).isEqualTo(metalsAndColorsElementOnLeftSideMenu.getText());
    }

    public void verifyElementPacksElementNameOnLeftSideMenu(String expectedName) {
        softAssertions.assertThat(expectedName).isEqualTo(elementsPacksElementOnLeftSideMenu.getText());
    }

    public DifferentPage openDifferentPage() {
        serviceElementOnLeftSideMenu.click();
        differentPage.click();
        return new DifferentPage(webDriver);
    }
}
