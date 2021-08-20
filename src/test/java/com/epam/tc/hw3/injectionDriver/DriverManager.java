package com.epam.tc.hw3.injectionDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager implements DriverService{
    @Override
    public WebDriver getWebDriver() {
        setupChromeDriver();
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return webDriver;
    }

    private void setupChromeDriver() {
        WebDriverManager.chromedriver().setup();
    }
}
