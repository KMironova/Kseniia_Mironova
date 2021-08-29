package com.epam.tc.hw5.cucumber.steps;

import com.epam.tc.hw5.pages.EpamInformationFrameworkPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractStep {

    protected WebDriver webDriver;
    protected EpamInformationFrameworkPage epamPage;

    protected AbstractStep () {

    }
}
