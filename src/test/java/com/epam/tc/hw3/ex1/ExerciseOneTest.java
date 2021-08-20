package com.epam.tc.hw3.ex1;

import com.epam.tc.hw3.ConfProperties;
import com.epam.tc.hw3.TestBase;
import com.epam.tc.hw3.pages.EpamInformationFrameworkPage;
import org.testng.annotations.Test;

public class ExerciseOneTest extends TestBase {

    @Test
    public void testExerciseOne() {
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

        //5. Assert that there are 4 items on the header sections are displayed and they have proper texts
        epamInformationFrameworkPage.verifyHomeElementNameOnHeader("Home");
        epamInformationFrameworkPage.verifyContactsElementNameOnHeader("CONTACT FORM");
        epamInformationFrameworkPage.verifyServiceElementNameOnHeader("SERVICE");
        epamInformationFrameworkPage.verifyColorsAndMetalsElementNameOnHeader("METALS & COLORS");

        //6. Assert that there are 4 images on the Index Page and they are displayed
        epamInformationFrameworkPage.verifyThatBaseIconIsDisplayed();
        epamInformationFrameworkPage.verifyThatPractiseIconIsDisplayed();
        epamInformationFrameworkPage.verifyThatMultiIconIsDisplayed();
        epamInformationFrameworkPage.verifyThatCustomIconIsDisplayed();

        //7. Assert that there are 4 texts on the Index Page under icons and they have proper text
        epamInformationFrameworkPage.verifyThatProperTextIsUnderBaseIcon("To include good practices\n"
                                                                        + "and ideas from successful\n"
                                                                        + "EPAM project");
        epamInformationFrameworkPage.verifyThatProperTextIsUnderPractiseIcon("To be flexible and\n"
                                                                                            + "customizable");
        epamInformationFrameworkPage.verifyThatProperTextIsUnderMultiIcon("To be multiplatform");
        epamInformationFrameworkPage.verifyThatProperTextIsUnderCustomIcon("Already have good base\n"
                                                                                    + "(about 20 internal and\n"
                                                                                    + "some external projects),\n"
                                                                                    + "wish to get more…");

        //8. Assert that there is the iframe with “Frame Button” exist
        epamInformationFrameworkPage.verifyIframeExist();

        //9. Switch to the iframe and check that there is “Frame Button” in the iframe
        epamInformationFrameworkPage.verifyThatButtonExistOnIframe();

        //10. Switch to original window back
        epamInformationFrameworkPage.switchToHomePage();

        //11. Assert that there are 5 items in the Left Section are displayed and they have proper text

        epamInformationFrameworkPage.verifyHomeElementNameOnLeftSideMenu("Home");
        epamInformationFrameworkPage.verifyServiceElementNameOnLeftSideMenu("Service");
        epamInformationFrameworkPage.verifyContactElementNameOnLeftSideMenu("Contact form");
        epamInformationFrameworkPage.verifyMetalsAndColorsElementNameOnLeftSideMenu("Metals & Colors");
        epamInformationFrameworkPage.verifyElementPacksElementNameOnLeftSideMenu("Elements packs");

        softAssertions.assertAll();
    }
}
