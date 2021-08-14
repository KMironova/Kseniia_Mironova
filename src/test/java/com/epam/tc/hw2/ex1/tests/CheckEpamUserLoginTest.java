package com.epam.tc.hw2.ex1.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw2.ex1.ConfProperties;
import com.epam.tc.hw2.ex1.TestBase;
import org.testng.annotations.Test;

public class CheckEpamUserLoginTest extends TestBase {

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
