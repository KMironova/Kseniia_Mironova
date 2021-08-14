package com.epam.tc.hw2.ex1.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw2.ex1.ConfProperties;
import com.epam.tc.hw2.ex1.Elements;
import com.epam.tc.hw2.ex1.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckEpamUserLoginTest extends TestBase {

    @BeforeClass
    public void setWebDriver() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        element = new Elements(webDriver);
        webDriver.manage().window().maximize();
        webDriver.navigate().to(ConfProperties.getProperty("url"));
    }

    //4. Assert Username is loggined
    @Test
    public void testExistUserLogin() {
        String usernameAfterLogin = "ROMAN IOVLEV";
        element.clickDropdownToggle();
        element.login(ConfProperties.getProperty("username"), ConfProperties.getProperty("password"));

        assertThat(usernameAfterLogin)
            .as("login failed")
            .isEqualTo(element.getUserName());
    }
}
