package com.epam.tc.hw6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    public static WebDriver webDriver;
    public SoftAssertions softAssertions;

    @BeforeClass
    public void setWebDriver(ITestContext context) {
        WebDriverManager.chromedriver().setup();
        softAssertions = new SoftAssertions();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        context.setAttribute("driver", webDriver);
    }

    @AfterClass
    public void closeElements() {
        webDriver.quit();
    }
}
