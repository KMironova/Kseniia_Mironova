package com.epam.tc.hw1;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDivideDoubleFunction {
    private Calculator calculator;

    @BeforeClass
    public void createCalculator() {
        calculator = new Calculator();
    }

    @AfterClass
    public void makeCalculatorEmpty() {
        calculator = null;
    }

    @Test(dataProviderClass = DataProviderForDivideDoubleTest.class,
          dataProvider = "data for divide double test",
          groups = {"multiply and divide operations"})
    public void testDivideDouble(double result, double dividend, double divider) {
        double actualResult = calculator.div(dividend, divider);
        assertThat(result).as("wrong calculation").isEqualTo(actualResult);
    }
}
