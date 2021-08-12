package com.epam.tc.hw1.dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviderForDivideByZeroLongTest {
    @DataProvider(name = "data for divide by zero long test")
    public static Object [][] dataForDivideByZeroLongTest() {
        return new Object[][] {
            {Long.MAX_VALUE, 0}
        };
    }
}
