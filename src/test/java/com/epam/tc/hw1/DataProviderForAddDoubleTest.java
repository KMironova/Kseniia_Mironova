package com.epam.tc.hw1;

import org.testng.annotations.DataProvider;

public class DataProviderForAddDoubleTest {
    @DataProvider(name = "data for add double test")
    public static Object [][] dataForAddDoubleTest() {
        return new Object[][] {
            {Double.MAX_VALUE, Double.MAX_VALUE - 1.0, 1.0},
            {Double.MAX_VALUE, 0, Double.MAX_VALUE},
            {Double.MAX_VALUE, Double.MAX_VALUE, 0}
        };
    }
}
