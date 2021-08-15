package com.epam.tc.hw2.ex1.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw2.ex1.GeneralWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckIframeExistTest extends GeneralWebDriver {

    //8. Assert that there is the iframe with “Frame Button” exist
    @Test
    public void testExistFrameButton() {
        WebElement frameElement = webDriver.findElement(By.id("frame"));
        assertThat(frameElement.isDisplayed()).isTrue();
    }
}
