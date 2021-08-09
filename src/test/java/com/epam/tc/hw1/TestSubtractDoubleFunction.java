package com.epam.tc.hw1;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSubtractDoubleFunction {

    private Calculator calculator;

    @BeforeClass
    public void createCalculator() {
        calculator = new Calculator();
    }

    @AfterClass
    public void makeCalculatorEmpty() {
        calculator = null;
    }

    @Test(dataProviderClass = DataProviderForSubtractDoubleTest.class,
          dataProvider = "data for subtraction double test",
          groups = {"add and subtract operations"})
    public void testSubtractDouble(double result, double minuend, double subtrahend) {
        double actualResult = calculator.sub(minuend, subtrahend);
        assertThat(result).as("wrong calculation").isEqualTo(actualResult);
    }
}

