package com.epam.tc.hw1.data.providers;

import org.testng.annotations.DataProvider;

public class DataProviderForSubtractDoubleTest {
    @DataProvider(name = "data for subtraction double test")
    public static Object [][] dataForSubtractDoubleTest() {
        return new Object[][]{
            {0, Double.MAX_VALUE, Double.MAX_VALUE},
            {Double.MAX_VALUE, Double.MAX_VALUE, 0},
            {-Double.MAX_VALUE, 0, Double.MAX_VALUE},
            {Double.MAX_VALUE - 1.0, Double.MAX_VALUE, 1.0}
        };
    }
}
