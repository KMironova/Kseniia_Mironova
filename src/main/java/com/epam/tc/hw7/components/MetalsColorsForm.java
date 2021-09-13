package com.epam.tc.hw7.components;

import com.epam.jdi.light.actions.ActionProcessor;
import com.epam.jdi.light.common.Exceptions;
import com.epam.jdi.light.common.JDIAction;
import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.complex.Checklist;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.composite.Form$AjcClosure1;
import com.epam.jdi.light.elements.pageobjects.annotations.WebAnnotationsUtil;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.complex.RadioButtons;
import com.epam.jdi.tools.LinqUtils;
import com.epam.jdi.tools.ReflectionUtils;
import com.epam.jdi.tools.StringUtils;
import com.epam.jdi.tools.map.MapArray;
import com.epam.jdi.tools.pairs.Pair;
import com.epam.tc.hw7.entities.MetalsColors;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;

public class MetalsColorsForm extends Form<MetalsColors> {
    private Object pageObject;

    public MetalsColorsForm() {
        this.pageObject = this;
    }

    @UI("form#form") Form<MetalsColors> metalsColorsForm;

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

    @Override
    public void fill(MapArray<String, String> map) {
        List<Field> allFields = this.allFields();
        Pair pair;
        Iterator var4;
        if (allFields.size() == 0) {
            var4 = map.iterator();

            while (var4.hasNext()) {
                pair = (Pair) var4.next();
                UIElement element = new UIElement();

                try {
                    Pair finalPair = pair;
                    element = (new UIElement()).setup((e) -> {
                        e.setName((String) finalPair.key).setParent(this);
                    });
                    this.fillAction((Field) null, element, this.pageObject, (String) pair.value);
                } catch (Exception var7) {
                    throw Exceptions.exception(var7, "Failed to fill element '%s' (locator: %s) with value '%s'", new Object[]{pair.key, this.elementLocator(element), pair.value});
                }
            }

        } else {
            var4 = map.iterator();

            while (var4.hasNext()) {
                pair = (Pair) var4.next();
                Field setField = null;

                try {
                    Pair finalPair1 = pair;
                    setField = (Field) LinqUtils.first(allFields, (f) -> {
                        return StringUtils.namesEqual((String) finalPair1.key, WebAnnotationsUtil.getElementName(f));
                    });
                    if (setField != null) {
                        this.fillAction(setField, ReflectionUtils.getValueField(setField, this.pageObject), this.pageObject, (String) pair.value);
                    }
                } catch (Exception var8) {
                    throw Exceptions.exception(var8, "Can't fill element '%s' with value '%s'",
                        new Object[]{pair.key, pair.value});
                }
            }
            this.setFilterAll();
        }
    }

    @UI("button#submit-button")
    Button submitButton;

    @JDIAction("Fill '{name}' with {0}")
    @Override
    public void fill(MetalsColors entity) {
        JoinPoint var3 = Factory.makeJP(ajc$tjp_0, this, this, entity);
        ActionProcessor var10000 = ActionProcessor.aspectOf();
        Object[] var4 = new Object[]{this, entity, var3};
        var10000.jdiAround((new Form$AjcClosure1(var4)).linkClosureAndJoinPoint(69648));
        //metalsColorsForm.submit();
    }

}
