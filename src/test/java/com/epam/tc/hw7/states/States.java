package com.epam.tc.hw7.states;

import io.qameta.allure.Step;

import static com.epam.tc.hw7.pages.HomePage.logout;
import static com.epam.tc.hw7.pages.HomePage.loginForm;
import static com.epam.tc.hw7.pages.HomePage.userIcon;
import static com.epam.tc.hw7.pages.HomePage.userName;

public class States {

    @Step
    public static void shouldBeLoggedOut() {
        if (userName.isDisplayed())
            logout();
        if (loginForm.isDisplayed())
            userIcon.click();
    }
    @Step
    public static void logout() {
        if (!logout.isDisplayed())
            userIcon.click();
        logout.click();
    }
}
