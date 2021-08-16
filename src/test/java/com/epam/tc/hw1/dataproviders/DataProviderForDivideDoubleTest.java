package com.epam.tc.hw1.dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviderForDivideDoubleTest {
    @DataProvider(name = "data for divide double test")
    public static Object [][] dataForDivideDoubleTest() {
        return new Object[][] {
            {1.0, Double.MAX_VALUE, Double.MAX_VALUE},
            {0, 0, Double.MAX_VALUE},
            {1.0 / Double.MAX_VALUE, 1.0, Double.MAX_VALUE}
        };
    }
}
