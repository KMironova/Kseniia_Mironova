package com.epam.tc.hw3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver webDriver;
    public SoftAssertions softAssertions;

    @BeforeClass
    public void setWebDriver() {
        WebDriverManager.chromedriver().setup();
        softAssertions = new SoftAssertions();
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
    }

    @AfterClass
    public void closeElements() {
        webDriver.quit();
    }
}
