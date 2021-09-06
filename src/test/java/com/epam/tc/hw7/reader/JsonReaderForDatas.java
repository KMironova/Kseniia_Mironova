package com.epam.tc.hw7.reader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReaderForDatas {
    static JSONParser parser = new JSONParser();

    public static String getElementFromData(String dataNameFromJason, String elementName) {
        try {
            JSONObject datas = (JSONObject) parser.parse(new FileReader(
                "src/test/resources/JDI_ex8_metalsColorsDataSet.json"));
            JSONObject data = (JSONObject) datas.get(dataNameFromJason);
            return (String) data.get(elementName);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<String> getStringsFromData(String dataNameFromJason, String elementName) {
        try {
            JSONObject d = (JSONObject) parser.parse(new FileReader(
                "src/test/resources/JDI_ex8_metalsColorsDataSet.json"));
            JSONObject data = (JSONObject) d.get(dataNameFromJason);
            return (List<String>) data.get(elementName);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Long> getLongsFromData(String dataNameFromJason, String elementName) {
        try {
            JSONObject d = (JSONObject) parser.parse(new FileReader(
                "src/test/resources/JDI_ex8_metalsColorsDataSet.json"));
            JSONObject data = (JSONObject) d.get(dataNameFromJason);
            return (List<Long>) data.get(elementName);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
