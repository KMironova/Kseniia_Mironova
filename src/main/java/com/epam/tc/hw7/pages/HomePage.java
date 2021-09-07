package com.epam.tc.hw7.pages;

import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.complex.JList;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.tc.hw7.entities.MenuItem;
import com.epam.tc.hw7.entities.User;
import org.openqa.selenium.WebElement;

@Url("/index.html")
@Title("Home Page")
public class HomePage extends WebPage {

    @Css("form") public static Form<User> loginForm;
    @UI(".navbar-nav li")public static JList<MenuItem> headerMenu;
    @UI("img#user-icon")public static UIElement userIcon;
    @Css(".logout") public static WebElement logout;
    @Css(".profile-photo [ui=label]") public static UIElement userName;
}
