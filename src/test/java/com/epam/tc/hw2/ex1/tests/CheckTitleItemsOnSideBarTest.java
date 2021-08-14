package com.epam.tc.hw2.ex1.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw2.ex1.TestBase;
import org.testng.annotations.Test;

public class CheckTitleItemsOnSideBarTest extends TestBase {

    //11. Assert that there are 5 items in the Left Section are displayed and they have proper text
    @Test
    public void test5() {
        String titleHome = "Home";
        String titleService = "Service";
        String titleContactForm = "Contact form";
        String titleMetalsAndColors = "Metals & Colors";
        String titleElementsPacks = "Elements packs";

        assertThat(titleHome).isEqualTo(element.getTextFromHomeOnSideBar());
        assertThat(titleService).isEqualTo(element.getTextFromServiceOnSideBar());
        assertThat(titleContactForm).isEqualTo(element.getTextFromContactOnSideBar());
        assertThat(titleMetalsAndColors).isEqualTo(element.getTextFromMetalsAndColorsOnSideBar());
        assertThat(titleElementsPacks).isEqualTo(element.getTextFromElementsPacksOnSideBar());
    }
}
