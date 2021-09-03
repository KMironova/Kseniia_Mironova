package com.epam.tc.hw7;

import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.tc.hw7.entities.User;
import com.epam.tc.hw7.pages.HomePage;
import com.epam.tc.hw7.pages.MetalsColorsPage;
import org.openqa.selenium.WebElement;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class SiteJdi {

    public static HomePage homePage;
    public static MetalsColorsPage metalsColorsPage;

    @Css(".profile-photo [ui=label]") public static UIElement userName;
    @Css("form") public static Form<User> loginForm;
    @Css(".logout") public static WebElement logout;
    @Css("img#user-icon") public static UIElement userIcon;
}
