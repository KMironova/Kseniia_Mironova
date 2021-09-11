package com.epam.tc.hw7.entities;

import com.epam.jdi.tools.DataClass;

import java.util.List;

public class MetalsColors extends DataClass<MetalsColors> {
    Long oddsSelector;
    Long evenSelector;


    List<String> elements;
    String color;
    String metal;
    List<String> vegetables;

    public MetalsColors(String oddsSelector, String evenSelector, List<String> elements, String color, String metal, List<String> vegetables) {
        this.oddsSelector = Long.valueOf(oddsSelector);
        this.evenSelector = Long.valueOf(evenSelector);
        this.elements = elements;
        this.color = color;
        this.metal = metal;
        this.vegetables = vegetables;
    }
}
