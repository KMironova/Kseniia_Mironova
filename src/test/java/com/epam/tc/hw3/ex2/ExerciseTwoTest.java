package com.epam.tc.hw3.ex2;

import com.epam.tc.hw3.ConfProperties;
import com.epam.tc.hw3.TestBase;
import com.epam.tc.hw3.pages.DifferentPage;
import com.epam.tc.hw3.pages.EpamInformationFrameworkPage;
import org.testng.annotations.Test;

public class ExerciseTwoTest extends TestBase {

    @Test
    public void testExerciseTwo() {
        EpamInformationFrameworkPage epamInformationFrameworkPage = new EpamInformationFrameworkPage(webDriver);

        //1. Open  test site by URL
        epamInformationFrameworkPage.openPage(ConfProperties.getProperty("url"));

        //2. Assert Browser title
        epamInformationFrameworkPage.verifyHomePageTitle("Home Page");

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

        /*9. Assert that
        • for each checkbox there is an individual log row and value is corresponded to the status of checkbox
        • for radio button there is a log row and value is corresponded to the status of radio button
        • for dropdown there i  s a log row and value is corresponded to the selected value*/
        differentPage.verifySelectedCheckBoxWater();
        differentPage.verifySelectedCheckBoxWind();
        differentPage.verifySelectedRadioSelen();
        differentPage.verifySelectedDropDownYellow();

        softAssertions.assertAll();
    }
}
