package com.epam.tc.hw2.ex1.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw2.ex1.TestBase;
import org.testng.annotations.Test;

public class ImageExistOnTheIndexPageTest extends TestBase {

    //6. Assert that there are 4 images on the Index Page and they are displayed
    @Test
    public void testImagesExistOnTheIndexPage() {
        assertThat(element.isBaseIconExist()).isTrue();
        assertThat(element.isPractiseIconExist()).isTrue();
        assertThat(element.isMultiIconExist()).isTrue();
        assertThat(element.isCustomIconExist()).isTrue();
    }
}
