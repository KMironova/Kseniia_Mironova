package com.epam.tc.hw7.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.tc.hw7.components.MetalsColorsForm;

@Url("/metals-colors.html") @Title("Metal and Colors")
public class MetalsColorsPage extends WebPage {

    @UI("form")public static MetalsColorsForm metalsColorsForm;
}
