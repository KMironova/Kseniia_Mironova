package com.epam.tc.hw2.ex1.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw2.ex1.TestBase;
import org.testng.annotations.Test;

public class EpamExistItemTitleOnTheHeaderTest extends TestBase {

    //5. Assert that there are 4 items on the header section are displayed and they have proper texts
    @Test
    public void testCheckItemsOnTheHeader() {
        String homeBarName = "HOME";
        String contactFormBarName = "CONTACT FORM";
        String serviceBarName = "SERVICE";
        String metalsAndColorsBarName = "METALS & COLORS";

        assertThat(homeBarName)
            .as("wrong name for 'home' bar")
            .isEqualTo(element.getHomeBarTitle());
        assertThat(contactFormBarName)
            .as("wrong name for 'contact' bar")
            .isEqualTo(element.getContactBarTitle());
        assertThat(serviceBarName)
            .as("wrong name for 'service' bar")
            .isEqualTo(element.getServiceBarTitle());
        assertThat(metalsAndColorsBarName)
            .as("wrong name for 'metals and colors' bar")
            .isEqualTo(element.getMetalsAndColorsBarTitle());
    }
}
