package com.epam.tc.hw7.test;

import static com.epam.jdi.light.settings.WebSettings.logger;

import com.epam.jdi.light.driver.WebDriverUtils;
import com.epam.jdi.light.elements.init.PageFactory;
import com.epam.tc.hw7.SiteJdi;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    public static SoftAssertions softAssertions;

    @BeforeSuite
    static void beforeSuite() {
        softAssertions = new SoftAssertions();
        PageFactory.initSite(SiteJdi.class);
        logger.info("Run Tests");
    }

    @AfterSuite
    static void afterSuite() {
        WebDriverUtils.killAllSeleniumDrivers();
        logger.info("Stop test");
    }
}
