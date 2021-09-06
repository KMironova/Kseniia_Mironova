package com.epam.tc.hw7.dataprovider;

import com.epam.tc.hw7.reader.JsonReaderForDatas;
import org.testng.annotations.DataProvider;

public class DataProviderForMetalsColorsTest {

    @DataProvider(name = "data for metals color test")
    public static Object [][] dataProviderForMetalsColorsTest() {
        return new Object[][] {
                {JsonReaderForDatas.getLongsFromData("data_1", "summary"),
                 JsonReaderForDatas.getStringsFromData("data_1", "elements"),
                 JsonReaderForDatas.getElementFromData("data_1", "color"),
                 JsonReaderForDatas.getElementFromData("data_1", "metals"),
                 JsonReaderForDatas.getStringsFromData("data_1", "vegetables")},

                {JsonReaderForDatas.getLongsFromData("data_2", "summary"),
                JsonReaderForDatas.getStringsFromData("data_2", "elements"),
                JsonReaderForDatas.getElementFromData("data_2", "color"),
                JsonReaderForDatas.getElementFromData("data_2", "metals"),
                JsonReaderForDatas.getStringsFromData("data_2", "vegetables")},

                {JsonReaderForDatas.getLongsFromData("data_3", "summary"),
                 JsonReaderForDatas.getStringsFromData("data_3", "elements"),
                 JsonReaderForDatas.getElementFromData("data_3", "color"),
                 JsonReaderForDatas.getElementFromData("data_3", "metals"),
                 JsonReaderForDatas.getStringsFromData("data_3", "vegetables")},

                {JsonReaderForDatas.getLongsFromData("data_4", "summary"),
                 JsonReaderForDatas.getStringsFromData("data_4", "elements"),
                 JsonReaderForDatas.getElementFromData("data_4", "color"),
                 JsonReaderForDatas.getElementFromData("data_4", "metals"),
                 JsonReaderForDatas.getStringsFromData("data_4", "vegetables")},

                {JsonReaderForDatas.getLongsFromData("data_5", "summary"),
                 JsonReaderForDatas.getStringsFromData("data_5", "elements"),
                 JsonReaderForDatas.getElementFromData("data_5", "color"),
                 JsonReaderForDatas.getElementFromData("data_5", "metals"),
                 JsonReaderForDatas.getStringsFromData("data_5", "vegetables")}
        };
    }
}
