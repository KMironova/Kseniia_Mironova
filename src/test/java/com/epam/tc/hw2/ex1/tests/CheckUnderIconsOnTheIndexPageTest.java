package com.epam.tc.hw2.ex1.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw2.ex1.GeneralWebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckUnderIconsOnTheIndexPageTest extends GeneralWebDriver {

    //7. Assert that there are 4 texts on the Index Page under icons and they have proper text
    @Test
    public void test() {
        String textUnderPractiseIcon = "To include good practices\n" + "and ideas from successful\n" + "EPAM project";
        String textUnderCustomIcon = "To be flexible and\n" + "customizable";
        String textUnderMultiIcon = "To be multiplatform";
        String textUnderBaseIcon = "Already have good base\n" + "(about 20 internal and\n"
            + "some external projects),\n"
            + "wish to get more…";

        String textUnderPractiseIconActual = webDriver.findElement(By.xpath(
                                 "//span[starts-with(text(),'To include good practices')]")).getText();
        String textUnderCustomIconActual = webDriver.findElement(By.xpath(
                                 "//span[starts-with(text(),'To be flexible')]")).getText();
        String textUnderMultiIconActual = webDriver.findElement(By.xpath(
                                 "//span[starts-with(text(),'To be multiplatform')]")).getText();
        String textUnderBaseIconActual = webDriver.findElement(By.xpath(
                                 "//span[starts-with(text(),'Already have good')]")).getText();


        assertThat(textUnderPractiseIcon).isEqualTo(textUnderPractiseIconActual);
        assertThat(textUnderBaseIcon).isEqualTo(textUnderBaseIconActual);
        assertThat(textUnderCustomIcon).isEqualTo(textUnderCustomIconActual);
        assertThat(textUnderMultiIcon).isEqualTo(textUnderMultiIconActual);
    }
}
