package com.epam.tc.hw7.entities;


import com.epam.jdi.light.elements.common.UIElement;

public class MenuItem extends UIElement {
    @Override
    public boolean isSelected() {
        return hasClass("active") && attr("ui").equals("label");
    }
}
