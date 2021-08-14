package com.epam.tc.hw2.ex2.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw2.ex2.ConfProperties;
import com.epam.tc.hw2.ex2.Elements;
import com.epam.tc.hw2.ex2.TestBase;
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
        String username = "Roman";
        String password = "Jdi1234";
        String usernameAfterLogin = "ROMAN IOVLEV";
        element.clickDropdownToggle();
        element.login(username, password);

        assertThat(usernameAfterLogin)
            .as("login failed")
            .isEqualTo(element.getUserName());
    }
}
