package com.epam.tc.hw7.entities;

import com.epam.jdi.tools.DataClass;
import java.util.List;

public class MetalsColors extends DataClass<MetalsColors> {
    int oddsSelector;
    int evenSelector;

    String color;
    String metal;
    List<String> vegetables;
    List<String> elements;

    public MetalsColors(int oddsSelector, int evenSelector, String color, String metal,
                                        List<String> elements, List<String> vegetables) {
        this.oddsSelector = oddsSelector;
        this.evenSelector = evenSelector;
        this.color = color;
        this.metal = metal;
        this.elements = elements;
        this.vegetables = vegetables;
    }
}
