package com.epam.tc.hw2.ex1.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw2.ex1.GeneralWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ImageExistOnTheIndexPageTest extends GeneralWebDriver {

    //6. Assert that there are 4 images on the Index Page and they are displayed
    @Test
    public void testImagesExistOnTheIndexPage() {
        WebElement baseIconElement = webDriver.findElement(By.className("icon-base"));
        WebElement practiseIconElement = webDriver.findElement(By.className("icon-practise"));
        WebElement multiIconElement = webDriver.findElement(By.className("icon-multi"));
        WebElement customIconElement = webDriver.findElement(By.className("icon-custom"));

        assertThat(baseIconElement.isDisplayed()).isTrue();
        assertThat(practiseIconElement.isDisplayed()).isTrue();
        assertThat(multiIconElement.isDisplayed()).isTrue();
        assertThat(customIconElement.isDisplayed()).isTrue();
    }
}
