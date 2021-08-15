package com.epam.tc.hw2.ex1.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw2.ex1.GeneralWebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class CheckTitleItemsOnSideBarTest extends GeneralWebDriver {
    @AfterClass
    public void closeElements() {
        webDriver.quit();
    }

    //11. Assert that there are 5 items in the Left Section are displayed and they have proper text
    @Test
    public void testCheckItemsTitleOnSideBar() {
        String windowHandler = webDriver.getWindowHandle();
        webDriver.switchTo().window(windowHandler);

        String titleHome = "Home";
        String titleService = "Service";
        String titleContactForm = "Contact form";
        String titleMetalsAndColors = "Metals & Colors";
        String titleElementsPacks = "Elements packs";

        assertThat(titleHome).isEqualTo(
            webDriver.findElement(By.xpath("//span[text() = 'Home']")).getText());
        assertThat(titleService).isEqualTo(
            webDriver.findElement(By.xpath("//span[text() = 'Service']")).getText());
        assertThat(titleContactForm).isEqualTo(
            webDriver.findElement(By.xpath("//span[text() = 'Contact form']")).getText());
        assertThat(titleMetalsAndColors).isEqualTo(
            webDriver.findElement(By.xpath("//span[text() = 'Metals & Colors']")).getText());
        assertThat(titleElementsPacks).isEqualTo(
            webDriver.findElement(By.xpath("//span[text() = 'Elements packs']")).getText());
    }
}
