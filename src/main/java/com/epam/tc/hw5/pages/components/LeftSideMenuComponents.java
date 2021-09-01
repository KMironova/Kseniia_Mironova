package com.epam.tc.hw5.pages.components;

import com.epam.tc.hw5.pages.DifferentPage;
import io.qameta.allure.Step;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeftSideMenuComponents extends AbstractComponent {

    public LeftSideMenuComponents(WebDriver webDriver, SoftAssertions softAssertions) {
        super(webDriver, softAssertions);
    }

    @FindBy(xpath = "//span[text() = 'Service']")
    private WebElement serviceElement;

    @FindBy(xpath = "//span[text() = 'Different elements']")
    private WebElement differentPage;

    @Step ("Open page with name 'Different Page'")
    public DifferentPage openDifferentPage(WebDriver webDriver, SoftAssertions softAssertions) {
        serviceElement.click();
        differentPage.click();
        return new DifferentPage(webDriver, softAssertions);
    }
}
