package com.epam.tc.hw6.driver;

import java.util.Objects;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.openqa.selenium.WebDriver;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class WebDriverManagerSingleton {

    private static WebDriver webDriver;

    public static WebDriver getWebDriver() {
        if (Objects.isNull(webDriver)) {
            webDriver = WebDriverFactory.createWebDriver(System.getProperty("driver.type"),
                                                        System.getProperty("browser.name"));
        }
        return webDriver;
    }

    public static void closeDriver() {
        webDriver.quit();
        webDriver = null;
    }
}
