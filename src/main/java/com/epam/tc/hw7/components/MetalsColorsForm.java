package com.epam.tc.hw7.components;

import com.epam.jdi.light.elements.complex.Checklist;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.complex.RadioButtons;
import com.epam.tc.hw7.entities.MetalsColors;

import java.util.List;

public class MetalsColorsForm extends Form<MetalsColors> {
    @UI("section#odds-selector input") RadioButtons oddsSelector;
    @UI("section#even-selector input") RadioButtons evenSelector;

    @JDropdown(root = "div#colors",
               value = "span.text['Colors']",
               list = "li",
               expand = ".caret")
    Dropdown colors;

    @JDropdown(root = "div#metals",
               value = "span.text['Metals']",
               list = "li",
               expand = ".caret")
    Dropdown metals;

    @JDropdown(root = "div#salad-dropdown",
               value = "#text",
               list = "li",
               expand = ".caret")
    Dropdown vegetables;

    @UI("[type=checkbox]")
    Checklist elements;

    public void test () {
        oddsSelector.select(2);
    }
    public void fillAction(List<Long> summary, List<String> elements, String color, String metal, List<String> vegetables) {
        selectElemenets(elements);
        colors.select(color);
        metals.select(metal);
        selectVegetables(vegetables);
        //oddsSelector.select(Math.toIntExact(summary.get(0)));
        //evenSelector.select(Math.toIntExact(summary.get(1)));
    }

    private void selectElemenets(List<String> elementsList) {
        for(String element: elementsList)
            elements.select(element);
    }

    private void selectVegetables(List<String> vegetablesList) {
        vegetables.select("Vegetables");
        for(String vegetable: vegetablesList)
            vegetables.select(vegetable);
    }
}
