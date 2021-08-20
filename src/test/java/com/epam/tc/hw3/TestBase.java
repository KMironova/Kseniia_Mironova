package com.epam.tc.hw3;

import com.epam.tc.hw3.injectionDriver.WebDriverInjector;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    public static WebDriver webDriver;
    public SoftAssertions softAssertions;

    @BeforeClass
    public void setWebDriver() {
        WebDriverManager.chromedriver().setup();
        softAssertions = new SoftAssertions();
        webDriver = new WebDriverInjector().getDriverService().getWebDriver();
        webDriver.manage().window().maximize();
    }

    @AfterClass
    public void closeElements() {
        webDriver.quit();
    }
}
