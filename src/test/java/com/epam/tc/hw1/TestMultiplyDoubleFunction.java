package com.epam.tc.hw1;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestMultiplyDoubleFunction {

    private Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public void createCalculator() {
        calculator = new Calculator();
    }

    @AfterClass(alwaysRun = true)
    public void makeCalculatorEmpty() {
        calculator = null;
    }

    @Test(dataProviderClass = DataProviderForMultiplyDoubleTest.class,
          dataProvider = "data for multiply double test",
          groups = {"multiply and divide operations"})
    public void testMultiplyDouble(double result, double factorFirst, double factorSecond) {
        double actualResult = calculator.mult(factorFirst, factorSecond);
        assertThat(result).as("wrong calculation").isEqualTo(actualResult);
    }
}

