package com.epam.tc.hw7.components;

import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Text;

public class ResultLog extends Section {

    @UI("//li[@class = 'summ-res']")
    public Text summaryValue;

    @UI("//li[@class = 'elem-res']")
    public Text elementsValue;

    @UI("//li[@class = 'col-res']")
    public Text colorValue;

    @UI("//li[@class = 'met-res']")
    public Text metalValue;

    @UI("//li[@class = 'sal-res']")
    public Text vegetablesValue;

}
