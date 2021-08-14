package com.epam.tc.hw2.ex1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {

    public WebDriver driver;

    public Elements(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "li.dropdown:nth-child(1) > a:nth-child(1)")
    private WebElement dropdownToggle;

    @FindBy(id = "name")
    private WebElement loginField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(linkText = "HOME")
    private WebElement homeBar;

    @FindBy(linkText = "CONTACT FORM")
    private WebElement contactBar;

    @FindBy(linkText = "SERVICE")
    private WebElement serviceBar;

    @FindBy(linkText = "METALS & COLORS")
    private WebElement metalcolorsBar;

    @FindBy(className = "icon-practise")
    private WebElement practiseIcon;

    @FindBy(className = "icon-custom")
    private WebElement customIcon;

    @FindBy(className = "icon-multi")
    private WebElement multiIcon;

    @FindBy(className = "icon-base")
    private WebElement baseIcon;

    @FindBy(xpath = "//span[starts-with(text(),'To include good practices')]")
    private WebElement textUnderPractiseIcon;

    @FindBy(xpath = "//span[starts-with(text(),'To be flexible')]")
    private WebElement textUnderCustomIcon;

    @FindBy(xpath = "//span[starts-with(text(),'To be multiplatform')]")
    private WebElement textUnderMultiIcon;

    @FindBy(xpath = "//span[starts-with(text(),'Already have good')]")
    private WebElement textUnderBaseIcon;

    @FindBy(id = "frame")
    private WebElement buttonFrame;

    @FindBy(id = "frame-button")
    private WebElement buttonOnFrameButton;

    @FindBy(xpath = "//span[text() = 'Home']")
    private WebElement homeOnSideBar;

    @FindBy(xpath = "//span[text() = 'Service']")
    private WebElement serviceOnSideBar;

    @FindBy(xpath = "//span[text() = 'Metals & Colors']")
    private WebElement metalsAndColorsOnSideBar;

    @FindBy(xpath = "//span[text() = 'Elements packs']")
    private WebElement elementPacksOnSideBar;

    @FindBy(xpath = "//span[text() = 'Contact form']")
    private WebElement contactFormOnSideBar;

    public void clickDropdownToggle() {
        dropdownToggle.click();
    }

    public void login(String login, String password) {
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public String getUserName() {
        return username.getText();
    }

    public String getHomeBarTitle() {
        return homeBar.getText();
    }

    public String getContactBarTitle() {
        return contactBar.getText();
    }

    public String getServiceBarTitle() {
        return serviceBar.getText();
    }

    public String getMetalsAndColorsBarTitle() {
        return metalcolorsBar.getText();
    }

    public Boolean isPractiseIconExist() {
        return practiseIcon.isDisplayed();
    }


    public Boolean isCustomIconExist() {
        return customIcon.isDisplayed();
    }


    public Boolean isMultiIconExist() {
        return multiIcon.isDisplayed();
    }


    public Boolean isBaseIconExist() {
        return baseIcon.isDisplayed();
    }

    public String getTextUnderPractiseIcon() {
        return textUnderPractiseIcon.getText();
    }

    public String getTextUnderBaseIcon() {
        return textUnderBaseIcon.getText();
    }

    public String getTextUnderCustomIcon() {
        return textUnderCustomIcon.getText();
    }

    public String getTextUnderMultiIcon() {
        return textUnderMultiIcon.getText();
    }

    public Boolean isButtonFrameExist() {
        return buttonFrame.isDisplayed();
    }

    public Boolean isButtonOnButtonFrameExist() {
        return buttonOnFrameButton.isDisplayed();
    }

    public String getTextFromHomeOnSideBar() {
       return homeOnSideBar.getText();
    }

    public String getTextFromContactOnSideBar() {
        return contactFormOnSideBar.getText();
    }

    public String getTextFromServiceOnSideBar() {
        return serviceOnSideBar.getText();
    }

    public String getTextFromMetalsAndColorsOnSideBar() {
        return metalsAndColorsOnSideBar.getText();
    }

    public String getTextFromElementsPacksOnSideBar() {
        return elementPacksOnSideBar.getText();
    }
}
