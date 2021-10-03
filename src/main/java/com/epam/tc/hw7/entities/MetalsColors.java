package com.epam.tc.hw7.entities;

import com.epam.jdi.tools.DataClass;
import java.util.List;

public class MetalsColors extends DataClass<MetalsColors> {
    public Integer oddSelector;
    public Integer evenSelector;

    public String color;
    public String metal;
    public List<String> vegetables;
    public List<String> elements;

    public MetalsColors(Integer oddSelector, Integer evenSelector, String color, String metal,
                                        List<String> elements, List<String> vegetables) {
        this.oddSelector = oddSelector;
        this.evenSelector = evenSelector;
        this.color = color;
        this.metal = metal;
        this.elements = elements;
        this.vegetables = vegetables;
    }
}
