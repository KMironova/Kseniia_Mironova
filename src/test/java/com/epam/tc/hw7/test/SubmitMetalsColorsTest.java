package com.epam.tc.hw7.test;

import static com.epam.tc.hw7.SiteJdi.homePage;
import static com.epam.tc.hw7.entities.Defaults.DEFAULT_USER;
import static com.epam.tc.hw7.entities.HeaderMenuData.MetalsColors;
import static com.epam.tc.hw7.pages.HomePage.headerMenu;
import static com.epam.tc.hw7.pages.HomePage.loginForm;
import static com.epam.tc.hw7.pages.HomePage.userIcon;
import static com.epam.tc.hw7.pages.MetalsColorsPage.metalsColorsForm;
import static com.epam.tc.hw7.pages.MetalsColorsPage.resultLog;

import com.epam.tc.hw7.dataprovider.DataProviderForMetalsColorsTest;
import com.epam.tc.hw7.entities.MetalsColors;
import com.epam.tc.hw7.listeners.TestNGListener;
import com.epam.tc.hw7.utils.ReaderUtil;
import java.util.List;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListener.class)
public class SubmitMetalsColorsTest extends TestBase {

    @Test (dataProviderClass = DataProviderForMetalsColorsTest.class,
          dataProvider = "data for metals color test")
    public void testSubmitMetalsColors(String [] summary, List<String> elements, String color,
                                       String metal, List<String> vegetables) {

        homePage.open();
        userIcon.click();
        loginForm.loginAs(DEFAULT_USER);
        headerMenu.select(MetalsColors);
        MetalsColors metalsColors = new MetalsColors(summary[0], summary[1], color, metal, elements, vegetables);

        metalsColorsForm.fill(metalsColors);

        softAssertions.assertThat(resultLog.summaryValue.getText())
                      .isEqualTo("Summary: " + (Integer.parseInt(summary[0]) + Integer.parseInt(summary[1])));
        softAssertions.assertThat(resultLog.elementsValue.getText())
                      .isEqualTo("Elements: " + ReaderUtil.getString(elements));
        softAssertions.assertThat(resultLog.colorValue.getText())
                      .isEqualTo("Color: " + color);
        softAssertions.assertThat(resultLog.metalValue.getText())
                      .isEqualTo("Metal: " + metal);
        softAssertions.assertThat(resultLog.vegetablesValue.getText())
                      .isEqualTo("Vegetables: " + ReaderUtil.getString(vegetables));
    }
}
