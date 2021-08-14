package com.epam.tc.hw2.ex2.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw2.ex2.ConfProperties;
import com.epam.tc.hw2.ex2.TestBase;
import org.testng.annotations.Test;

public class NextTest extends TestBase {
/* Assert that
• for each checkbox there is an individual log row and value is corresponded to the status of checkbox
• for radio button there is a log row and value is corresponded to the status of radio button
• for dropdown there i  s a log row and value is corresponded to the selected value*/

    @Test
    public void test() {
        element.clickDropdownToggle();
        element.login(ConfProperties.getProperty("username"), ConfProperties.getProperty("password"));
        element.clickOnDifferentElement();

        element.selectCheckBoxWater();
        element.selectCheckBoxWind();
        element.selectRadioSelen();
        element.selectDropDownYellow();

        assertThat(element.checkLogForCheckBoxWater()).isTrue();
        assertThat(element.checkSelectedCheckBoxWater()).isTrue();

        assertThat(element.checkLogForCheckBoxWind()).isTrue();
        assertThat(element.checkSelectedCheckBoxWind()).isTrue();

        assertThat(element.checkLogForRadioSelen()).isTrue();
        assertThat(element.checkSelectedRadioSelen()).isTrue();

        assertThat(element.checkLogForDropDownYellow()).isTrue();
        assertThat(element.checkSelectedDropDownYellow()).isTrue();


    }
}
