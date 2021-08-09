package com.epam.tc.hw1;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAddDoubleFunction {

    private Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public void createCalculator() {
        calculator = new Calculator();
    }

    @AfterClass(alwaysRun = true)
    public void makeCalculatorEmpty() {
        calculator = null;
    }

    @Test(dataProviderClass = DataProviderForAddDoubleTest.class,
          dataProvider = "data for add double test",
          groups = {"add and subtract operations"})
    public void testAddDouble(double result, double termFirst, double termSecond) {
        double actualResult = calculator.sum(termFirst, termSecond);
        assertThat(result).as("wrong calculation").isEqualTo(actualResult);
    }
}

