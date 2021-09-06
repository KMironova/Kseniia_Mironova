package com.epam.tc.hw7.test;

import static com.epam.jdi.light.settings.WebSettings.logger;

import com.epam.jdi.light.driver.WebDriverUtils;
import com.epam.jdi.light.elements.init.PageFactory;
import com.epam.tc.hw7.SiteJdi;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public interface TestBase {

    @BeforeSuite
    static void beforeSuite() {
        PageFactory.initSite(SiteJdi.class);
        logger.info("Run Tests");
    }

    @AfterSuite
    static void afterSuite() {
        WebDriverUtils.killAllSeleniumDrivers();
    }
}
