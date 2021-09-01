package com.epam.tc.hw6.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import javax.management.openmbean.InvalidOpenTypeException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class WebDriverFactory {
    private static final String BROWSER_CHROME = "chrome";
    private static final String BROWSER_FIREFOX = "firefox";

    private static final String REMOTE_DRIVER_TYPE = "remote";
    private static final String LOCAL_DRIVER_TYPE = "local";

    public static WebDriver createWebDriver(final String driverType, final String browserName) {
        if (REMOTE_DRIVER_TYPE.equalsIgnoreCase(driverType)) {
            return createRemoteDriver(browserName);
        } else if (LOCAL_DRIVER_TYPE.equalsIgnoreCase(driverType)) {
            return createLocalDriver(browserName);
        } else {
            throw new WebDriverTypeException(String.format("Unsupported driver type", driverType));
        }
    }

    private static WebDriver createLocalDriver(String browserName) {
        WebDriver webDriver;

        switch (browserName.toLowerCase(Locale.ROOT)) {
            case BROWSER_CHROME:
                webDriver = createChromeDriver();
                break;
            case BROWSER_FIREFOX:
                webDriver = createFirefoxDriver();
                break;
            default:
                throw new BrowserNameException(String.format("Unsupported browser name", browserName));
        }

        return webDriver;
    }

    private static WebDriver createChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    private static WebDriver createFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    private static WebDriver createRemoteDriver(String browserName) {
        Capabilities capabilities;

        switch (browserName.toLowerCase(Locale.ROOT)) {
            case BROWSER_CHROME:
                capabilities = createRemoteChromeCapabilities();
                break;
            case BROWSER_FIREFOX:
                capabilities = createRemoteFirefoxCapabilities();
                break;
            default:
                throw new BrowserNameException(String.format("Unsupported browser name", browserName));
        }

        try {
            return new RemoteWebDriver(new URL("http://10.1.1.1:4444/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new InvalidOpenTypeException("Incorrect selenium grid url");
        }
    }

    private static Capabilities createRemoteChromeCapabilities() {
        return new ChromeOptions();
    }

    private static Capabilities createRemoteFirefoxCapabilities() {
        return new FirefoxOptions();
    }
}
