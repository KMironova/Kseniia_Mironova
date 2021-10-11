package com.epam.tc.hw7.dataprovider;

import com.epam.tc.hw7.utils.JsonReaderForDatas;
import org.testng.annotations.DataProvider;

public class DataProviderForMetalsColorsTest {

    @DataProvider(name = "data for metals color test")
    public static Object [][] dataProviderForMetalsColorsTest() {
        return JsonReaderForDatas.getDatas();
    }
}
