package com.epam.tc.hw1.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw1.BaseTest;
import com.epam.tc.hw1.dataproviders.DataProviderForAddDoubleTest;
import org.testng.annotations.Test;

public class TestAddDoubleFunction extends BaseTest {

    @Test(dataProviderClass = DataProviderForAddDoubleTest.class,
          dataProvider = "data for add double test",
          groups = {"add and subtract operations"})
    public void testAddDouble(double result, double termFirst, double termSecond) {
        double actualResult = calculator.sum(termFirst, termSecond);
        assertThat(result).as("wrong calculation").isEqualTo(actualResult);
    }
}

