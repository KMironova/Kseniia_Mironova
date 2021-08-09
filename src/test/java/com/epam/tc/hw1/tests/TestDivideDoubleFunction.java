package com.epam.tc.hw1.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw1.BaseTest;
import com.epam.tc.hw1.data.providers.DataProviderForDivideDoubleTest;
import org.testng.annotations.Test;

public class TestDivideDoubleFunction extends BaseTest {

    @Test(dataProviderClass = DataProviderForDivideDoubleTest.class,
          dataProvider = "data for divide double test",
          groups = {"multiply and divide operations"})
    public void testDivideDouble(double result, double dividend, double divider) {
        double actualResult = calculator.div(dividend, divider);
        assertThat(result).as("wrong calculation").isEqualTo(actualResult);
    }
}
