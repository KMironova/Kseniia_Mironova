package com.epam.tc.hw2.ex2;

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

    @FindBy(xpath = "//span[text() = 'Service']")
    private WebElement serviceOnSideBar;

    @FindBy(xpath = "//span[text() = 'Different elements']")
    private WebElement differentElementsOnSideBar;

    public void clickOnDifferentElement() {
        serviceOnSideBar.click();
        differentElementsOnSideBar.click();
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

    @FindBy(xpath = "//label[text()[contains(.,'Water')]]/input")
    private WebElement checkBoxWater;

    @FindBy(xpath = "//label[text()[contains(.,'Wind')]]/input")
    private WebElement checkBoxWind;

    @FindBy(xpath = "//label[text()[contains(.,'Selen')]]/input")
    private WebElement radioSelen;

    @FindBy(xpath = "//option[text() = 'Yellow']")
    private WebElement dropDownYellow;

    @FindBy(xpath = "//li[contains(text(), 'Wind:')]")
    private WebElement logForCheckBoxWind;

    @FindBy(xpath = "//li[contains(text(), 'Water:')]")
    private WebElement logForCheckBoxWater;

    @FindBy(xpath = "//li[text()[contains(., 'metal:')]]")
    private WebElement logForRadioSelen;

    @FindBy(xpath = "//li[contains(text(), 'Colors:')]")
    private WebElement logForDropDownYellow;

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

    public void selectCheckBoxWater() {
        checkBoxWater.click();
    }

    public void selectCheckBoxWind() {
        checkBoxWind.click();
    }

    public void selectRadioSelen() {
        radioSelen.click();
    }

    public void selectDropDownYellow() {
        dropDownYellow.click();
    }

    public Boolean checkSelectedCheckBoxWater() {
        return checkBoxWater.isSelected();
    }

    public Boolean checkSelectedCheckBoxWind() {
        return checkBoxWind.isSelected();
    }

    public Boolean checkSelectedRadioSelen() {
        return radioSelen.isSelected();
    }

    public Boolean checkSelectedDropDownYellow() {
        return dropDownYellow.isSelected();
    }

    public Boolean checkLogForCheckBoxWater() {
        return logForCheckBoxWater.isDisplayed();
    }

    public Boolean checkLogForCheckBoxWind() {
        return logForCheckBoxWind.isDisplayed();
    }

    public Boolean checkLogForRadioSelen() {
        return logForRadioSelen.isDisplayed();
    }

    public Boolean checkLogForDropDownYellow() {
        return logForDropDownYellow.isDisplayed();
    }
}
