package com.epam.tc.hw7.utils;

import java.util.List;
import java.util.ListIterator;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ReaderUtil {

    public static String getString(List<String> objectList) {
        StringBuilder result = new StringBuilder();
        ListIterator<String> iterator = objectList.listIterator();

        for (String str : objectList) {
            result.append(str);
            iterator.next();

            if (iterator.hasNext()) {
                result.append(",");
            }
        }
        return result.toString();
    }
}
