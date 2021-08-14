package com.epam.tc.hw2.ex1.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw2.ex1.TestBase;
import org.testng.annotations.Test;

public class CheckButtonIsExistOnIframeTest extends TestBase {

    //9. Switch to the iframe and check that there is “Frame Button” in the iframe
    @Test
    public void testExistButtonOnFrame() {
        webDriver.switchTo().frame("frame");
        assertThat(element.isButtonOnButtonFrameExist()).isTrue();
    }
}
