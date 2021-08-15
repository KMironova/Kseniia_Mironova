package com.epam.tc.hw2.ex1.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw2.ex1.GeneralWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckButtonIsExistOnIframeTest extends GeneralWebDriver {

    //9. Switch to the iframe and check that there is “Frame Button” in the iframe
    @Test
    public void testExistButtonOnFrame() {
        webDriver.switchTo().frame("frame");
        WebElement element = webDriver.findElement(By.id("frame-button"));
        assertThat(element.isDisplayed()).isTrue();
    }
}
