package com.epam.tc.hw7.entities;

import com.epam.jdi.tools.DataClass;
import java.util.List;

public class MetalsColors extends DataClass<MetalsColors> {
    String oddsSelector;
    String evenSelector;


    List<String> elements;
    String color;
    String metal;
    List<String> vegetables;

    public MetalsColors(String oddsSelector, String evenSelector, List<String> elements, String color, String metal, List<String> vegetables) {
        this.oddsSelector = oddsSelector;
        this.evenSelector = evenSelector;
        this.elements = elements;
        this.color = color;
        this.metal = metal;
        this.vegetables = vegetables;
    }
}
