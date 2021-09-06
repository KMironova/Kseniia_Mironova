package com.epam.tc.hw7.test;

import static com.epam.jdi.light.settings.WebSettings.logger;

import com.epam.jdi.light.driver.WebDriverUtils;
import com.epam.jdi.light.elements.init.PageFactory;
import com.epam.tc.hw7.SiteJdi;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    public static SoftAssertions softAssertions;

    @BeforeMethod
    static void beforeSuite() {
        softAssertions = new SoftAssertions();
        PageFactory.initSite(SiteJdi.class);
        logger.info("Run Tests");
    }

    @AfterMethod
    static void afterSuite() {
        WebDriverUtils.killAllSeleniumDrivers();
        logger.info("Stop test");
    }
}
