package com.epam.tc.hw2.ex1.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw2.ex1.TestBase;
import org.testng.annotations.Test;

public class CheckEpamUserLoginTest extends TestBase {

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
