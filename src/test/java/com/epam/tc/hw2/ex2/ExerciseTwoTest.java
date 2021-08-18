package com.epam.tc.hw2.ex2;

import com.epam.tc.hw2.ConfProperties;
import com.epam.tc.hw2.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ExerciseTwoTest extends TestBase {

    @Test
    public void testExerciseTwo() {
        //1. Open  test site by URL
        webDriver.navigate().to(ConfProperties.getProperty("url"));

        //2. Assert Browser title
        String pageTitle = "Home Page";
        softAssertions.assertThat(pageTitle)
                .as("wrong title")
                .isEqualTo(webDriver.getTitle());

        //3. Perform login
        webDriver.findElement(By.cssSelector("li.dropdown:nth-child(1) > a:nth-child(1)")).click();
        webDriver.findElement(By.id("name")).sendKeys(ConfProperties.getProperty("username"));
        webDriver.findElement(By.id("password")).sendKeys(ConfProperties.getProperty("password"));
        webDriver.findElement(By.id("login-button")).click();

        //4. Assert Username is loggined
        String usernameAfterLogin = "ROMAN IOVLEV";
        softAssertions.assertThat(usernameAfterLogin)
                .as("login failed")
                .isEqualTo(webDriver.findElement(By.id("user-name")).getText());

        //5. Open through the header menu Service -> Different Page
        webDriver.findElement(By.xpath("//span[text() = 'Service']")).click();
        webDriver.findElement(By.xpath("//span[text() = 'Different elements']")).click();

        //6.Select checkboxes (Wind,Water)
        WebElement checkBoxWater = webDriver.findElement(By.xpath(
                "//label[text()[contains(.,'Water')]]/input"));
        checkBoxWater.click();
        WebElement checkBoxWind = webDriver.findElement(By.xpath(
                "//label[text()[contains(.,'Wind')]]/input"));
        checkBoxWind.click();

        //7. Select radio (Selen)
        WebElement radioSelen = webDriver.findElement(By.xpath(
                "//label[text()[contains(.,'Selen')]]/input"));
        radioSelen.click();

        //8. Select in dropdown (Yellow)
        WebElement dropDownYellow = webDriver.findElement(By.xpath(
                "//option[text() = 'Yellow']"));
        dropDownYellow.click();

        /*9. Assert that
        • for each checkbox there is an individual log row and value is corresponded to the status of checkbox
        • for radio button there is a log row and value is corresponded to the status of radio button
        • for dropdown there i  s a log row and value is corresponded to the selected value*/
        WebElement logForCheckBoxWater =  webDriver.findElement(By.xpath(
                "//li[contains(text(), 'Water:')]"));
        WebElement logForCheckBoxWind =  webDriver.findElement(By.xpath(
                "//li[contains(text(), 'Wind:')]"));
        WebElement logForRadioSelen =  webDriver.findElement(By.xpath(
                "//li[contains(text(), 'metal:')]"));
        WebElement logForDropDownYellow =  webDriver.findElement(By.xpath(
                "//li[contains(text(), 'Colors:')]"));

        softAssertions.assertThat(logForCheckBoxWater.isDisplayed()).isTrue();
        softAssertions.assertThat(checkBoxWater.isSelected()).isTrue();

        softAssertions.assertThat(logForCheckBoxWind.isDisplayed()).isTrue();
        softAssertions.assertThat(checkBoxWind.isSelected()).isTrue();

        softAssertions.assertThat(logForRadioSelen.isDisplayed()).isTrue();
        softAssertions.assertThat(radioSelen.isSelected()).isTrue();

        softAssertions.assertThat(logForDropDownYellow.isDisplayed()).isTrue();
        softAssertions.assertThat(dropDownYellow.isSelected()).isTrue();

        softAssertions.assertAll();
    }
}
