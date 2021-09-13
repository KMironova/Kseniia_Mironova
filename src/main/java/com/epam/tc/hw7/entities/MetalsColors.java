package com.epam.tc.hw7.entities;

import com.epam.jdi.tools.DataClass;
import java.util.List;

public class MetalsColors extends DataClass<MetalsColors> {
    public String oddsSelector;
    public String evenSelector;

    public String color;
    public String metal;
    public List<String> vegetables;
    public List<String> elements;

    public MetalsColors(String oddsSelector, String evenSelector, String color, String metal,
                                        List<String> elements, List<String> vegetables) {
        this.oddsSelector = oddsSelector;
        this.evenSelector = evenSelector;
        this.color = color;
        this.metal = metal;
        this.elements = elements;
        this.vegetables = vegetables;
    }
}
