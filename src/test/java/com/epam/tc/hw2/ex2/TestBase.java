package com.epam.tc.hw2.ex2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    public WebDriver webDriver;
    public Elements element;

    @BeforeClass
    public void setWebDriver() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        element = new Elements(webDriver);
        webDriver.manage().window().maximize();
        webDriver.navigate().to(ConfProperties.getProperty("url"));
    }

    @AfterClass
    public void closeElements() {
        //webDriver.quit();
        //element = null;
    }
}
