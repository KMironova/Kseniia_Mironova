package com.epam.tc.hw2.ex1.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw2.ex1.TestBase;
import org.testng.annotations.Test;

public class CheckIframeExistTest extends TestBase {

    //8. Assert that there is the iframe with “Frame Button” exist
    @Test
    public void testExistFrameButton() {
        assertThat(element.isButtonFrameExist()).isTrue();
    }
}
