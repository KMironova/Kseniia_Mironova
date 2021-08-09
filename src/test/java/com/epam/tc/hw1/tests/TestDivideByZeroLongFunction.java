package com.epam.tc.hw1.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import com.epam.tc.hw1.BaseTest;
import com.epam.tc.hw1.data.providers.DataProviderForDivideByZeroLongTest;
import org.testng.annotations.Test;

public class TestDivideByZeroLongFunction extends BaseTest {

    @Test(dataProviderClass = DataProviderForDivideByZeroLongTest.class,
          dataProvider = "data for divide by zero long test",
          groups = {"multiply and divide operations"})
    public void testDivideByZeroLong(long dividend, long divider) {
        assertThatThrownBy(() -> calculator.div(dividend, divider))
                                           .isInstanceOf(NumberFormatException.class)
                                           .hasMessageMatching("Attempt to divide by zero");
    }
}
