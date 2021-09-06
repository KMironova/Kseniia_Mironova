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
import com.epam.tc.hw7.listeners.TestNGListener;
import java.util.List;
import java.util.ListIterator;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListener.class)
public class SubmitMetalsColorsTest extends TestBase {

    @Test(dataProviderClass = DataProviderForMetalsColorsTest.class,
          dataProvider = "data for metals color test")
    public void testSubmitMetalsColors(List<Long> summary, List<String> elements,
                                       String color, String metal, List<String> vegetables) {

        homePage.open();
        userIcon.click();
        loginForm.loginAs(DEFAULT_USER);
        headerMenu.select(MetalsColors);
        metalsColorsForm.fillAction(summary, elements, color, metal, vegetables);

        softAssertions.assertThat(resultLog.summaryValue.getText())
                      .isEqualTo("Summary: " + (summary.get(0) + summary.get(1)));
        softAssertions.assertThat(resultLog.elementsValue.getText())
                      .isEqualTo("Elements: " + getString(elements));
        softAssertions.assertThat(resultLog.colorValue.getText())
                      .isEqualTo("Color: " + color);
        softAssertions.assertThat(resultLog.metalValue.getText())
                      .isEqualTo("Metal: " + metal);
        softAssertions.assertThat(resultLog.vegetablesValue.getText())
                      .isEqualTo("Vegetables: " + getString(vegetables));
    }

    private String getString(List<String> objectList) {
        StringBuilder result = new StringBuilder();
        ListIterator<String> iterator = objectList.listIterator();

        for (String str : objectList) {
            result.append(str);
            iterator.next();

            if (iterator.hasNext()) {
                result.append(",");
            }
        }
        return result.toString();
    }
}
