package com.epam.tc.hw6.ex2;

import com.epam.tc.hw4.pages.DifferentPage;
import com.epam.tc.hw4.pages.EpamInformationFrameworkPage;
import com.epam.tc.hw6.ConfProperties;
import com.epam.tc.hw6.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class ExerciseTwoTest extends TestBase {

    @Test
    @Description("test opening 'Different page' and selecting checkbox, radio and dropdown")
    @Feature("test selected function")
    @Story("select checkbox, radio, dropdown")
    public void testExerciseTwo() {
        EpamInformationFrameworkPage epamInformationFrameworkPage = new EpamInformationFrameworkPage(webDriver, softAssertions);

        //1. Open  test site by URL
        epamInformationFrameworkPage.openPage(ConfProperties.getProperty("url"));

        //2. Assert Browser title
        epamInformationFrameworkPage.verifyPageTitle("Home Page");

        //3. Perform login
        epamInformationFrameworkPage.login(ConfProperties.getProperty("password"),
                ConfProperties.getProperty("username"));

        //4. Assert Username is loggined
        epamInformationFrameworkPage.verifyLoginUser("ROMAN IOVLEV");

        //5. Open through the header menu Service -> Different Page
        DifferentPage differentPage = epamInformationFrameworkPage.openDifferentPage();

        //6.Select checkboxes (Wind,Water)
        differentPage.selectCheckBoxWater();
        differentPage.selectCheckBoxWind();

        //7. Select radio (Selen)
        differentPage.selectRadioSelen();

        //8. Select in dropdown (Yellow)
        differentPage.selectDropDownYellow();

        /*9. Assert that"
        + "• for each checkbox there is an individual log row and value is corresponded to the status of checkbox"
        + "• for radio button there is a log row and value is corresponded to the status of radio button"
        + "• for dropdown there i  s a log row and value is corresponded to the selected value*/
        differentPage.verifySelectedCheckBoxWater();
        differentPage.verifySelectedCheckBoxWind();
        differentPage.verifySelectedRadioSelen();
        differentPage.verifySelectedDropDownYellow();

        softAssertions.assertAll();
    }
}
