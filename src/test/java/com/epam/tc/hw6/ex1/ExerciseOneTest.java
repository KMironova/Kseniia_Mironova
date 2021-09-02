package com.epam.tc.hw6.ex1;

import com.epam.tc.hw4.pages.EpamInformationFrameworkPage;
import com.epam.tc.hw6.ConfProperties;
import com.epam.tc.hw6.TestBase;
import com.epam.tc.hw6.driver.WebDriverManagerSingleton;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class ExerciseOneTest extends TestBase {

    @Test
    @Description("test function: login, correct display icons and text")
    @Feature("base function")
    @Story("perfom login and correct page load")
    public void testExerciseOne() {
        EpamInformationFrameworkPage epamPage = new EpamInformationFrameworkPage(
                WebDriverManagerSingleton.getWebDriver(), softAssertions);

        //1. Open  test site by URL
        epamPage.openPage(ConfProperties.getProperty("url"));

        //2. Assert Browser title
        epamPage.verifyPageTitle("Home Page");

        //3. Perform login
        epamPage.login(ConfProperties.getProperty("password"),
                                           ConfProperties.getProperty("username"));

        //4. Assert Username is loggined
        epamPage.verifyLoginUser("ROMAN IOVLEV");

        //5. Assert that there are 4 items on the header sections are displayed and they have proper texts
        epamPage.verifyHomeElementNameOnHeader("HOME");
        epamPage.verifyContactsElementNameOnHeader("CONTACT FORM");
        epamPage.verifyServiceElementNameOnHeader("SERVICE");
        epamPage.verifyColorsAndMetalsElementNameOnHeader("METALS & COLORS");

        //6. Assert that there are 4 images on the Index Page and they are displayed
        epamPage.verifyThatBaseIconIsDisplayed();
        epamPage.verifyThatPractiseIconIsDisplayed();
        epamPage.verifyThatMultiIconIsDisplayed();
        epamPage.verifyThatCustomIconIsDisplayed();

        //7. Assert that there are 4 texts on the Index Page under icons and they have proper text
        epamPage.verifyThatProperTextIsUnderPractiseIcon("To include good practices\n"
                                                                                        + "and ideas from successful\n"
                                                                                        + "EPAM project");
        epamPage.verifyThatProperTextIsUnderCustomIcon("To be flexible and\n"
                                                                                        + "customizable");
        epamPage.verifyThatProperTextIsUnderMultiIcon("To be multiplatform");
        epamPage.verifyThatProperTextIsUnderBaseIcon("Already have good base\n"
                                                                                        + "(about 20 internal and\n"
                                                                                        + "some external projects),\n"
                                                                                        + "wish to get more…");

        //8. Assert that there is the iframe with “Frame Button” exist
        epamPage.verifyIframeExist();

        //9. Switch to the iframe and check that there is “Frame Button” in the iframe
        epamPage.verifyThatButtonExistOnIframe();

        //10. Switch to original window back
        epamPage.switchToHomePage();

        //11. Assert that there are 5 items in the Left Section are displayed and they have proper text
        epamPage.verifyHomeElementNameOnLeftSideMenu("Home");
        epamPage.verifyServiceElementNameOnLeftSideMenu("Service");
        epamPage.verifyContactElementNameOnLeftSideMenu("Contact form");
        epamPage.verifyMetalsAndColorsElementNameOnLeftSideMenu("Metals & Colors");
        epamPage.verifyElementPacksElementNameOnLeftSideMenu("Elements packs");

        softAssertions.assertAll();
    }
}
