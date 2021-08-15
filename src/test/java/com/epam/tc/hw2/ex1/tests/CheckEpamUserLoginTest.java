package com.epam.tc.hw2.ex1.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw2.ex1.ConfProperties;
import com.epam.tc.hw2.ex1.GeneralWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckEpamUserLoginTest extends GeneralWebDriver {

    @BeforeClass
    public void setWebDriver() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.navigate().to(ConfProperties.getProperty("url"));
    }

    //4. Assert Username is loggined
    @Test
    public void testExistUserLogin() {
        webDriver.findElement(By.cssSelector("li.dropdown:nth-child(1) > a:nth-child(1)")).click();
        webDriver.findElement(By.id("name")).sendKeys(ConfProperties.getProperty("username"));
        webDriver.findElement(By.id("password")).sendKeys(ConfProperties.getProperty("password"));
        webDriver.findElement(By.id("login-button")).click();

        String usernameAfterLogin = "ROMAN IOVLEV";
        assertThat(usernameAfterLogin)
            .as("login failed")
            .isEqualTo(webDriver.findElement(By.id("user-name")).getText());
    }
}
