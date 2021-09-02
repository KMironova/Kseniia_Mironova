package com.epam.tc.hw6.driver;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class WebDriverManagerSingleton {

    private static WebDriver webDriver;

    public static WebDriver getWebDriver() {
        if (Objects.isNull(webDriver)) {
            webDriver = WebDriverFactory.createWebDriver(ConfProperties.getProperty("driver_type"),
                                                        ConfProperties.getProperty("browser_name"));
        }
        return webDriver;
    }

    public static void closeDriver() {
        webDriver.quit();
        webDriver = null;
    }
}
