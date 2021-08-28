package com.epam.tc.hw5.ex1;

import com.epam.tc.hw5.ConfProperties;
import com.epam.tc.hw5.TestBase;
import com.epam.tc.hw4.pages.DifferentPage;
import com.epam.tc.hw4.pages.EpamInformationFrameworkPage;
import org.testng.annotations.Test;

public class ExerciseOneTest extends TestBase {
    @Test
    public void testExerciseTwo() {
        EpamInformationFrameworkPage epamInformationFrameworkPage = new EpamInformationFrameworkPage(webDriver, softAssertions);

        //1. Open  test site by URL
        epamInformationFrameworkPage.openPage(ConfProperties.getProperty("url"));

        //2. Perform login
        epamInformationFrameworkPage.login(ConfProperties.getProperty("password"),
                ConfProperties.getProperty("username"));
        //3. Open through the header menu Service -> Different Page
        DifferentPage differentPage = epamInformationFrameworkPage.openDifferentPage();

        //4.Select checkboxes (Wind,Water)
        differentPage.selectCheckBoxWater();
        differentPage.selectCheckBoxWind();

        //5. Select radio (Selen)
        differentPage.selectRadioSelen();

        //6. Select in dropdown (Yellow)
        differentPage.selectDropDownYellow();

        /*7. Assert that"
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
