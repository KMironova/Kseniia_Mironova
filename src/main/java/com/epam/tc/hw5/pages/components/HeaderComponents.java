package com.epam.tc.hw5.pages.components;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

import com.epam.tc.hw5.pages.UserTablePage;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderComponents extends AbstractComponent {

    public  HeaderComponents (WebDriver webDriver, SoftAssertions softAssertions) {
        super(webDriver,softAssertions);
    }

    @FindBy(linkText = "SERVICE")
    private WebElement elementService;

    @FindBy(css = "ul.dropdown-menu > li:nth-child(6) > a:nth-child(1)")
    private WebElement userTableServiceInDropDown;

    public void clickService() {
        elementService.click();
    }

    public UserTablePage clickUserTableInServiceInDropdown (WebDriver webDriver, SoftAssertions softAssertions) {
        userTableServiceInDropDown.click();
        return new UserTablePage(webDriver,softAssertions);
    }
}
