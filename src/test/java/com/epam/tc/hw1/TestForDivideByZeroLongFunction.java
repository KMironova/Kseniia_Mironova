package com.epam.tc.hw1;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestForDivideByZeroLongFunction {

    private Calculator calculator;
    private NumberFormatException exception;

    @BeforeClass(alwaysRun = true)
    public void createCalculator() {
        calculator = new Calculator();
        exception = new NumberFormatException("Attempt to divide by zero");
    }

    @AfterClass(alwaysRun = true)
    public void makeCalculatorEmpty() {
        calculator = null;
        exception = null;
    }

    @Test(expectedExceptions = {NumberFormatException.class},
          dataProviderClass = DataProviderForDivideByZeroLongTest.class,
          dataProvider = "data for divide by zero long test",
          groups = {"multiply and divide operations"})
    public void testDivideByZeroLong(long dividend, long divider) {
        long actualResult = calculator.div(dividend, divider);
        assertThat(exception.getClass()).as("wrong calculation").isEqualTo(actualResult);
    }
}
