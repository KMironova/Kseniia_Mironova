package com.epam.tc.hw1.data.providers;

import org.testng.annotations.DataProvider;

public class DataProviderForMultiplyDoubleTest {
    @DataProvider(name = "data for multiply double test")
    public static Object [][] dataForMultiplyDoubleTest() {
        return new Object[][] {
            {Double.MAX_VALUE, Double.MAX_VALUE, 1.0},
            {0, 0, Double.MAX_VALUE},
            {0, Double.MAX_VALUE, 0}
        };
    }
}
