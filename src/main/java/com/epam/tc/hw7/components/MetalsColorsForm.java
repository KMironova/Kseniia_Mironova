package com.epam.tc.hw7.components;

import com.epam.jdi.light.common.JDIAction;
import com.epam.jdi.light.elements.complex.Checklist;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.complex.RadioButtons;
import com.epam.tc.hw7.entities.MetalsColors;

public class MetalsColorsForm extends Form<MetalsColors> {

    @UI("section#odds-selector input") RadioButtons oddsSelector;
    @UI("section#even-selector input") RadioButtons evenSelector;

    @JDropdown(root = "div#colors",
               value = "span.text['Colors']",
               list = "li",
               expand = ".caret")
    Dropdown color;

    @JDropdown(root = "div#metals",
               value = "span.text['Metals']",
               list = "li",
               expand = ".caret")
    Dropdown metal;

    @JDropdown(root = "div#salad-dropdown",
               value = "#text",
               list = "li",
               expand = ".caret")
    Dropdown vegetables;

    @UI("[type=checkbox]")
    Checklist elements;

    @UI("button#submit-button")
    Button submitButton;

    public void submit() {
        submitButton.click();
    }

    @JDIAction("Fill '{name}' with {0}")
    @Override
    public void fill(MetalsColors entity) {
        oddsSelector.select(entity.oddsSelector);
        evenSelector.select(entity.evenSelector);

        color.select(entity.color);
        metal.select(entity.metal);

        entity.elements.forEach((el) -> elements.select(el));
        vegetables.select("Vegetables");
        entity.vegetables.forEach((veg) -> vegetables.select(veg));
    }
}
