package com.epam.tc.hw1.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw1.BaseTest;
import com.epam.tc.hw1.dataproviders.DataProviderForSubtractDoubleTest;
import org.testng.annotations.Test;

public class TestSubtractDoubleFunction extends BaseTest {

    @Test(dataProviderClass = DataProviderForSubtractDoubleTest.class,
          dataProvider = "data for subtraction double test",
          groups = {"add and subtract operations"})
    public void testSubtractDouble(double result, double minuend, double subtrahend) {
        double actualResult = calculator.sub(minuend, subtrahend);
        assertThat(result).as("wrong calculation").isEqualTo(actualResult);
    }
}

