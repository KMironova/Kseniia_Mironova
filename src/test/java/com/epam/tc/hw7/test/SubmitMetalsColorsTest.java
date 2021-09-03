package com.epam.tc.hw7.test;

import org.testng.annotations.Test;

import static com.epam.tc.hw7.states.States.shouldBeLoggedIn;
import static com.epam.tc.hw7.SiteJdi.*;
import static com.epam.tc.hw7.entities.Defaults.DEFAULT_USER;

public class SubmitMetalsColorsTest extends TestBase{

    @Test
    public void testSubmitMetalsColors() {
        //open Home page +
        //login +
        //open metals and colors page from header menu
        //fill form Metals & Colors by data below: data[%s]
        //Submit form Metals & Colors
        //check result section
        homePage.shouldBeOpened();
        shouldBeLoggedIn();
        userIcon.click();
        loginForm.loginAs(DEFAULT_USER);
    }
}
