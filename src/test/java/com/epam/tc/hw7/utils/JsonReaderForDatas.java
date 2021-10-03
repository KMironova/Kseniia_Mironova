package com.epam.tc.hw7.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReaderForDatas {

    public static Object[][] getDatas() {
        JSONObject datasFromJson = null;
        try {
            JSONParser parser = new JSONParser();
            datasFromJson = (JSONObject) parser.parse(new FileReader(
                "src/test/resources/JDI_ex8_metalsColorsDataSet.json"));
            return getObjectsData(datasFromJson);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Object [][] getObjectsData(JSONObject datasFromJson) {
        Object [][] datas = {};
        int nextDataNumber = 1;

        while (datasFromJson.get("data_" + nextDataNumber) != null) {
            JSONObject data = (JSONObject) datasFromJson.get("data_" + nextDataNumber);
            Object [][] newDataObjectArray = Arrays.copyOf(datas, datas.length + 1);
            newDataObjectArray[newDataObjectArray.length - 1] = generateNewObjectFromData(data);
            datas = newDataObjectArray;
            nextDataNumber++;
        }
        return datas;
    }

    private static Object [] generateNewObjectFromData(JSONObject objectData) {
        return  new Object[] {getSummaryMas(((JSONArray) objectData.get("summary")).toArray()),
                                                         objectData.get("elements"), objectData.get("color"),
                                                         objectData.get("metals"), objectData.get("vegetables")};
    }

    private static Integer [] getSummaryMas(Object [] ob) {
        return new Integer[] {Integer.parseInt(ob[0].toString()), Integer.parseInt(ob[1].toString())};
    }
}
