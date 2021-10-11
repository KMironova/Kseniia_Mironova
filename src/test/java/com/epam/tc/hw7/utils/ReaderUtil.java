package com.epam.tc.hw7.utils;

import java.util.List;
import java.util.ListIterator;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ReaderUtil {

    public static String getString(List<String> objectList) {
        return String.join(",", objectList);
    }
}
