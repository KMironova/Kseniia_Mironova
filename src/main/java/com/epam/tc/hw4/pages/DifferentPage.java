package com.epam.tc.hw4.pages;

import io.qameta.allure.Step;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DifferentPage extends BasePage {

    public DifferentPage(WebDriver driver, SoftAssertions softAssertions) {
        super(driver, softAssertions);
    }

    @FindBy(xpath = "//label[text()[contains(.,'Water')]]/input")
    private WebElement checkBoxWater;

    @FindBy(xpath = "//label[text()[contains(.,'Wind')]]/input")
    private WebElement checkBoxWind;

    @FindBy(xpath = "//label[text()[contains(.,'Selen')]]/input")
    private WebElement radioSelen;

    @FindBy(xpath = "//option[text() = 'Yellow']")
    private WebElement dropDownYellow;

    @FindBy(xpath = "//li[contains(text(), 'Water:')]")
    private WebElement logForCheckBoxWater;

    @FindBy(xpath = "//li[contains(text(), 'Wind:')]")
    private  WebElement logForCheckBoxWind;

    @FindBy(xpath = "//li[contains(text(), 'metal:')]")
    private WebElement logForRadioSelen;

    @FindBy(xpath = "//li[contains(text(), 'Colors:')]")
    private WebElement logForDropDownYellow;

    @Step ("Select element checkbox with name 'Water'")
    public void selectCheckBoxWater() {
        checkBoxWater.click();
    }

    @Step ("Select element checkbox with name 'Wind'")
    public void selectCheckBoxWind() {
        checkBoxWind.click();
    }

    @Step ("Select element radio with name 'Selen'")
    public void selectRadioSelen() {
        radioSelen.click();
    }

    @Step ("Select from dropdown list element with name 'Yellow'")
    public void selectDropDownYellow() {
        dropDownYellow.click();
    }

    @Step ("Verify that element checkbox with name 'Water' is selected and there is log for it")
    public void verifySelectedCheckBoxWater() {
        softAssertions.assertThat(logForCheckBoxWater.isDisplayed()).isTrue();
        softAssertions.assertThat(checkBoxWater.isSelected()).isTrue();
    }

    @Step ("Verify that element checkbox with name 'Wind' is selected and there is log for it")
    public void verifySelectedCheckBoxWind() {
        softAssertions.assertThat(logForCheckBoxWind.isDisplayed()).isTrue();
        softAssertions.assertThat(checkBoxWind.isSelected()).isTrue();
    }

    @Step ("Verify that element radio with name 'Selen' is selected and there is log for it")
    public void verifySelectedRadioSelen() {
        softAssertions.assertThat(logForRadioSelen.isDisplayed()).isTrue();
        softAssertions.assertThat(radioSelen.isSelected()).isTrue();
    }

    @Step ("Verify that element from dropdown list with name 'Yellow' is selected and there is log for it")
    public void verifySelectedDropDownYellow() {
        softAssertions.assertThat(logForDropDownYellow.isDisplayed()).isTrue();
        softAssertions.assertThat(dropDownYellow.isSelected()).isTrue();
    }
}
