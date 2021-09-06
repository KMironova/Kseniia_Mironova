package com.epam.tc.hw7.test;

import com.epam.tc.hw7.reader.JsonReaderForDatas;
import java.util.List;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.epam.tc.hw7.listeners.TestNGListener;

import static com.epam.tc.hw7.SiteJdi.*;
import static com.epam.tc.hw7.entities.Defaults.DEFAULT_USER;
import static com.epam.tc.hw7.pages.HomePage.loginForm;
import static com.epam.tc.hw7.pages.HomePage.headerMenu;
import static com.epam.tc.hw7.pages.HomePage.userIcon;
import static com.epam.tc.hw7.pages.MetalsColorsPage.metalsColorsForm;
import static com.epam.tc.hw7.entities.HeaderMenuData.MetalsColors;


@Listeners(TestNGListener.class)
public class SubmitMetalsColorsTest implements TestBase{

    @Test
    public void testSubmitMetalsColors() {
        //open Home page +
        //login +
        //open metals and colors page from header menu +
        //fill form Metals & Colors by data below: data[%s]
        //Submit form Metals & Colors
        //check result section
        homePage.open();
        userIcon.click();
        loginForm.loginAs(DEFAULT_USER);
        headerMenu.select(MetalsColors);
        metalsColorsForm.test();
        /*metalsColorsForm.fillAction(JsonReaderForDatas.getLongsFromData("data_1","summary"),
            JsonReaderForDatas.getStringsFromData("data_1","elements"),
            JsonReaderForDatas.getElementFromData("data_1","color"),
            JsonReaderForDatas.getElementFromData("data_1","metals"),
            JsonReaderForDatas.getStringsFromData("data_1","vegetables"));*/
    }
}
