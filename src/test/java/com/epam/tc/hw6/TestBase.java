package com.epam.tc.hw6;

import com.epam.tc.hw6.driver.WebDriverManagerSingleton;
import org.assertj.core.api.SoftAssertions;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    public SoftAssertions softAssertions;

    @BeforeClass
    public void setWebDriver() {
        softAssertions = new SoftAssertions();
        var webDriver = WebDriverManagerSingleton.getWebDriver();
        webDriver.manage().window().maximize();
    }

    @AfterClass
    public void closeElements() {
        WebDriverManagerSingleton.closeDriver();
    }
}
