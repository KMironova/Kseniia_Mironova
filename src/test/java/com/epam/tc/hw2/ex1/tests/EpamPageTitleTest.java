package com.epam.tc.hw2.ex1.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw2.ex1.TestBase;
import org.testng.annotations.Test;

public class EpamPageTitleTest extends TestBase {

    //2. Assert Browser title
    @Test
    public void testCheckPageTitle() {
        String pageTitle = "Home Page";
        assertThat(pageTitle)
            .as("wrong title")
            .isEqualTo(webDriver.getTitle());
    }
}