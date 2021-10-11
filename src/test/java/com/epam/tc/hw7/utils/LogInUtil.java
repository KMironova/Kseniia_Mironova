package com.epam.tc.hw7.utils;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.tc.hw4.ConfProperties;
import lombok.experimental.UtilityClass;

import static com.epam.tc.hw7.SiteJdi.*;
import static com.epam.tc.hw7.entities.Defaults.DEFAULT_USER;
import static com.epam.tc.hw7.pages.HomePage.userIcon;
import static com.epam.tc.hw7.pages.HomePage.userName;
import static com.epam.tc.hw7.pages.HomePage.loginForm;

@UtilityClass
public class LogInUtil {

    private static void onSite() {
        if (!WebPage.getUrl().contains(ConfProperties.getProperty("url")))
            homePage.open();
    }

    public static void shouldBeLoggedIn() {
        onSite();
        if (!userName.isDisplayed())
            login();
    }

    public static void login() {
        userIcon.click();
        loginForm.loginAs(DEFAULT_USER);
    }
}
