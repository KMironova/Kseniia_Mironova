package com.epam.tc.hw5.ex3.cucumber.hooks;

import com.epam.tc.hw5.ex1.cucumber.context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CucumberHook {

    public static WebDriver webDriver;
    public static SoftAssertions softAssertions;

    @Before
    public void initDriver() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        softAssertions = new SoftAssertions();
        webDriver.manage().window().maximize();

        TestContext.getInstance().addTestObject("web_driver", webDriver);
        TestContext.getInstance().addTestObject("soft_assertion", softAssertions);
    }

    @After
    public void closeDriver() {
        webDriver.quit();
        TestContext.getInstance().clean();
    }
}
