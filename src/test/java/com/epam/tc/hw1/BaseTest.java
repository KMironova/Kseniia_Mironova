package com.epam.tc.hw1;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public void createCalculator() {
        calculator = new Calculator();
    }

    @AfterClass(alwaysRun = true)
    public void makeCalculatorEmpty() {
        calculator = null;
    }
}
