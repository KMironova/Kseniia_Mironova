package com.epam.tc.hw2.ex1.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw2.ex1.GeneralWebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EpamExistItemTitleOnTheHeaderTest extends GeneralWebDriver {

    //5. Assert that there are 4 items on the header section are displayed and they have proper texts
    @Test
    public void testCheckItemsOnTheHeader() {
        String homeBarName = "HOME";
        String contactFormBarName = "CONTACT FORM";
        String serviceBarName = "SERVICE";
        String metalsAndColorsBarName = "METALS & COLORS";

        assertThat(homeBarName)
            .as("wrong name for 'home' bar")
            .isEqualTo(webDriver.findElement(By.linkText("HOME")));
        assertThat(contactFormBarName)
            .as("wrong name for 'contact' bar")
            .isEqualTo(webDriver.findElement(By.linkText("CONTACT FORM")));
        assertThat(serviceBarName)
            .as("wrong name for 'service' bar")
            .isEqualTo(webDriver.findElement(By.linkText("SERVICE")));
        assertThat(metalsAndColorsBarName)
            .as("wrong name for 'metals and colors' bar")
            .isEqualTo(webDriver.findElement(By.linkText("METALS & COLORS")));
    }
}
