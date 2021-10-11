package com.epam.tc.hw7.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReaderForDatas {

    public static Object[][] getDatas() {
        try {
            JSONParser parser = new JSONParser();
            JSONObject datasFromJson = (JSONObject) parser.parse(new FileReader(
                "src/test/resources/JDI_ex8_metalsColorsDataSet.json"));
            return getObjectsData(datasFromJson);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Object [][] getObjectsData(JSONObject datasFromJson) {
        Map<String, JSONObject> dataMap = new HashMap<>();
        datasFromJson.forEach((o,o2) -> dataMap.put(o.toString(), (JSONObject) o2));

        List<Object[]> objectList = new ArrayList<>();
        dataMap.forEach((key, value) -> objectList.add(new Object[]{
                                                            getSummaryMas(((JSONArray) value.get("summary")).toArray()),
                                                            value.get("elements"),
                                                            value.get("color"),
                                                            value.get("metals"),
                                                            value.get("vegetables")}));
        return objectList.toArray(new Object[0][]);
    }

    private static Integer [] getSummaryMas(Object [] ob) {
        return new Integer[] {Integer.parseInt(ob[0].toString()), Integer.parseInt(ob[1].toString())};
    }
}
