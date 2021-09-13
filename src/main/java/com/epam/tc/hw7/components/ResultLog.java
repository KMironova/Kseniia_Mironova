package com.epam.tc.hw7.components;

import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Text;

public class ResultLog extends Section {

    @UI("li#summ-res")
    public Text summaryValue;

    @UI("li#elem-res")
    public Text elementsValue;

    @UI("li#col-res")
    public Text colorValue;

    @UI("li#met-res")
    public Text metalValue;

    @UI("li#sal-res")
    public Text vegetablesValue;

}
