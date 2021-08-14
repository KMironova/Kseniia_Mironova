package com.epam.tc.hw2.ex1.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw2.ex1.TestBase;
import org.testng.annotations.Test;

public class CheckUnderIconsOnTheIndexPageTest extends TestBase {

    //7. Assert that there are 4 texts on the Index Page under icons and they have proper text
    @Test
    public void test() {
        String textUnderPractiseIcon = "To include good practices\n" + "and ideas from successful\n" + "EPAM project";
        String textUnderCustomIcon = "To be flexible and\n" + "customizable";
        String textUnderMultiIcon = "To be multiplatform";
        String textUnderBaseIcon = "Already have good base\n" + "(about 20 internal and\n"
            + "some external projects),\n"
            + "wish to get more…";

        assertThat(textUnderPractiseIcon).isEqualTo(element.getTextUnderPractiseIcon());
        assertThat(textUnderBaseIcon).isEqualTo(element.getTextUnderBaseIcon());
        assertThat(textUnderCustomIcon).isEqualTo(element.getTextUnderCustomIcon());
        assertThat(textUnderMultiIcon).isEqualTo(element.getTextUnderMultiIcon());
    }
}
