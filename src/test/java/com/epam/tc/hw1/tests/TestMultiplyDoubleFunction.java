package com.epam.tc.hw1.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw1.BaseTest;
import com.epam.tc.hw1.dataproviders.DataProviderForMultiplyDoubleTest;
import org.testng.annotations.Test;

public class TestMultiplyDoubleFunction extends BaseTest {

    @Test(dataProviderClass = DataProviderForMultiplyDoubleTest.class,
          dataProvider = "data for multiply double test",
          groups = {"multiply and divide operations"})
    public void testMultiplyDouble(double result, double factorFirst, double factorSecond) {
        double actualResult = calculator.mult(factorFirst, factorSecond);
        assertThat(result).as("wrong calculation").isEqualTo(actualResult);
    }
}

