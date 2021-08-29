package com.epam.tc.hw4.pages;

import com.epam.tc.hw3.pages.BasePage;
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

    public void verifySelectedCheckBoxWater() {
        softAssertions.assertThat(logForCheckBoxWater.isDisplayed()).isTrue();
        softAssertions.assertThat(checkBoxWater.isSelected()).isTrue();
    }

    public void verifySelectedCheckBoxWind() {
        softAssertions.assertThat(logForCheckBoxWind.isDisplayed()).isTrue();
        softAssertions.assertThat(checkBoxWind.isSelected()).isTrue();
    }

    public void verifySelectedRadioSelen() {
        softAssertions.assertThat(logForRadioSelen.isDisplayed()).isTrue();
        softAssertions.assertThat(radioSelen.isSelected()).isTrue();
    }

    public void verifySelectedDropDownYellow() {
        softAssertions.assertThat(logForDropDownYellow.isDisplayed()).isTrue();
        softAssertions.assertThat(dropDownYellow.isSelected()).isTrue();
    }
}
