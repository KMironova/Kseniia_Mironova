package com.epam.tc.hw7.components;

import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import org.openqa.selenium.WebElement;

public class ResultLog extends Section {

    @FindBy(className = "summ-res")
    public static WebElement summaryValue;

    @FindBy(className = "elem-res")
    public static WebElement elementsValue;

    @FindBy(className = "col-res")
    public static WebElement colorValue;

    @FindBy(className = "met-res")
    public static WebElement metalValue;

    @FindBy(className = "sal-res")
    public static WebElement vegetablesValue;

}
