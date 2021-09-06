package com.epam.tc.hw7.components;

import static com.epam.jdi.tools.ReflectionUtils.isInterface;

import com.epam.jdi.light.elements.complex.Checklist;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import com.epam.jdi.light.ui.html.elements.complex.RadioButtons;
import com.epam.tc.hw7.entities.MetalsColors;
import java.awt.Checkbox;
import java.lang.reflect.Field;
import java.util.List;

public class MetalsColorsForm extends Form<MetalsColors> {
    //@UI("[class=radio]")RadioButtons summaryOne;
    //@UI("#even-selector")RadioButtons summaryTwo;

    @UI("[title=Colors]") Button dropdownButtonForColors;
    @UI("button#Metals") Button dropdownButtonForMetals;
    @UI("#salad-dropdown") Button dropdownButtonForVegetables;

    @JDropdown(root = "div[ui=dropdown-menu]",
    //value = "span.text['Colors']",
               value = "span.filter-option['Colors']",
               list = "li",
               expand = ".caret")
    Dropdown colors;

    @JDropdown(root = "div[ui=dropdown-menu]",
               value = "#selected",
               list = "li",
               expand = ".caret")
    Dropdown metals;

    @JDropdown(root = "div[ui=dropdown-menu]",
               value = "#selected",
               list = "li",
               expand = ".caret")
    Dropdown vegetables;

    Checkbox element;
    Checklist elements;

    public void test() {
        colors.select("Red");
    }

    public void fillAction(List<Long> summary,List<String> elements,String color,String metal,List<String>vegetables) {
        System.out.println("do smt");
    }
}
