package com.epam.tc.hw7.test;

import com.epam.tc.hw7.dataProvider.DataProviderForMetalsColorsTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.epam.tc.hw7.listeners.TestNGListener;

import java.util.List;

import static com.epam.tc.hw7.SiteJdi.*;
import static com.epam.tc.hw7.entities.Defaults.DEFAULT_USER;
import static com.epam.tc.hw7.pages.HomePage.loginForm;
import static com.epam.tc.hw7.pages.HomePage.headerMenu;
import static com.epam.tc.hw7.pages.HomePage.userIcon;
import static com.epam.tc.hw7.pages.MetalsColorsPage.metalsColorsForm;
import static com.epam.tc.hw7.entities.HeaderMenuData.MetalsColors;
import static com.epam.tc.hw7.pages.MetalsColorsPage.infoPanel;
import static org.testng.Assert.assertEquals;


@Listeners(TestNGListener.class)
public class SubmitMetalsColorsTest implements TestBase{

    @Test(dataProviderClass = DataProviderForMetalsColorsTest.class,
          dataProvider = "data for metals color test")
    public void testSubmitMetalsColors(List<Long> summary, List<String> elements,
                                       String color, String metal, List<String> vegetables) {

        homePage.open();
        userIcon.click();
        loginForm.loginAs(DEFAULT_USER);
        headerMenu.select(MetalsColors);
        //metalsColorsForm.fillAction(summary,elements,color,metal,vegetables);
        metalsColorsForm.test();
        System.out.println(infoPanel.getText());
        //check result section
    }
}
