package com.epam.tc.hw7.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReaderForDatas {
    static JSONParser parser = new JSONParser();
    static int nextDataNumber = 1;

    public static Object[][] getDatas() {
        Object [][] datas = {};
        try {
            JSONObject datasFromJson = (JSONObject) parser.parse(new FileReader(
                "src/test/resources/JDI_ex8_metalsColorsDataSet.json"));

            while (datasFromJson.get("data_" + nextDataNumber) != null) {
                JSONObject data = (JSONObject) datasFromJson.get("data_" + nextDataNumber);
                Object [][] newDataObjectArray = Arrays.copyOf(datas, datas.length + 1);

                newDataObjectArray[newDataObjectArray.length - 1] =
                    new Object[] {data.get("summary"), data.get("elements"),
                        data.get("color"), data.get("metals"), data.get("vegetables")};

                datas = newDataObjectArray;
                nextDataNumber++;
            }
            return datas;
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
