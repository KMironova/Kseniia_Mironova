package com.epam.tc.hw2.ex2.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw2.ex2.GeneralWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class CheckSelectedElementsTest extends GeneralWebDriver {
/* Assert that
• for each checkbox there is an individual log row and value is corresponded to the status of checkbox
• for radio button there is a log row and value is corresponded to the status of radio button
• for dropdown there i  s a log row and value is corresponded to the selected value*/

    @AfterClass
    public void closeElements() {
        webDriver.quit();
    }

    @Test
    public void testCheckSelectedElements() {
        webDriver.findElement(By.xpath("//span[text() = 'Service']")).click();
        webDriver.findElement(By.xpath("//span[text() = 'Different elements']")).click();

        WebElement checkBoxWater = webDriver.findElement(By.xpath(
            "//label[text()[contains(.,'Water')]]/input"));
        checkBoxWater.click();
        WebElement checkBoxWind = webDriver.findElement(By.xpath(
            "//label[text()[contains(.,'Wind')]]/input"));
        checkBoxWind.click();
        WebElement radioSelen = webDriver.findElement(By.xpath(
            "//label[text()[contains(.,'Selen')]]/input"));
        radioSelen.click();
        WebElement dropDownYellow = webDriver.findElement(By.xpath(
            "//option[text() = 'Yellow']"));
        dropDownYellow.click();

        WebElement logForCheckBoxWater =  webDriver.findElement(By.xpath(
                                            "//li[contains(text(), 'Water:')]"));
        WebElement logForCheckBoxWind =  webDriver.findElement(By.xpath(
                                            "//li[contains(text(), 'Wind:')]"));
        WebElement logForRadioSelen =  webDriver.findElement(By.xpath(
                                            "//li[contains(text(), 'metal:')]"));
        WebElement logForDropDownYellow =  webDriver.findElement(By.xpath(
                                            "//li[contains(text(), 'Colors:')]"));

        assertThat(logForCheckBoxWater.isDisplayed()).isTrue();
        assertThat(checkBoxWater.isSelected()).isTrue();

        assertThat(logForCheckBoxWind.isDisplayed()).isTrue();
        assertThat(checkBoxWind.isSelected()).isTrue();

        assertThat(logForRadioSelen.isDisplayed()).isTrue();
        assertThat(radioSelen.isSelected()).isTrue();

        assertThat(logForDropDownYellow.isDisplayed()).isTrue();
        assertThat(dropDownYellow.isSelected()).isTrue();


    }
}
