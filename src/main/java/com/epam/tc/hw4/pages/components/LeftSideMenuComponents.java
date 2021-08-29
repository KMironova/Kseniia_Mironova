package com.epam.tc.hw4.pages.components;

import com.epam.tc.hw4.pages.DifferentPage;
import io.qameta.allure.Step;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeftSideMenuComponents extends AbstractComponent {

    public LeftSideMenuComponents (WebDriver webDriver, SoftAssertions softAssertions) {
        super(webDriver,softAssertions);
    }

    @FindBy(xpath = "//span[text() = 'Home']")
    private WebElement homeElementOnLeftSideMenu;

    @FindBy(xpath = "//span[text() = 'Service']")
    private WebElement serviceElementOnLeftSideMenu;

    @FindBy(xpath = "//span[text() = 'Contact form']")
    private WebElement contactsElementOnLeftSideMenu;

    @FindBy(xpath = "//span[text() = 'Metals & Colors']")
    private WebElement metalsAndColorsElementOnLeftSideMenu;

    @FindBy(xpath = "//span[text() = 'Elements packs']")
    private WebElement elementsPacksElementOnLeftSideMenu;

    @FindBy(xpath = "//span[text() = 'Different elements']")
    private WebElement differentPage;

    @Step("Verify that on left side menu element with name 'Home' have proper text")
    public void verifyHomeElementNameOnLeftSideMenu(String expectedName) {
        softAssertions.assertThat(expectedName).isEqualTo(homeElementOnLeftSideMenu.getText());
    }

    @Step ("Verify that on left side menu element with name 'Service' have proper text")
    public void verifyServiceElementNameOnLeftSideMenu(String expectedName) {
        softAssertions.assertThat(expectedName).isEqualTo(serviceElementOnLeftSideMenu.getText());
    }

    @Step ("Verify that on left side menu element with name 'Contact' have proper text")
    public void verifyContactElementNameOnLeftSideMenu(String expectedName) {
        softAssertions.assertThat(expectedName).isEqualTo(contactsElementOnLeftSideMenu.getText());
    }

    @Step ("Verify that on left side menu element with name 'Metals & Colors' have proper text")
    public void verifyMetalsAndColorsElementNameOnLeftSideMenu(String expectedName) {
        softAssertions.assertThat(expectedName).isEqualTo(metalsAndColorsElementOnLeftSideMenu.getText());
    }

    @Step ("Verify that on left side menu element with name 'Element Packs' have proper text")
    public void verifyElementPacksElementNameOnLeftSideMenu(String expectedName) {
        softAssertions.assertThat(expectedName).isEqualTo(elementsPacksElementOnLeftSideMenu.getText());
    }

    @Step ("Open page with name 'Different Page'")
    public DifferentPage openDifferentPage() {
        serviceElementOnLeftSideMenu.click();
        differentPage.click();
        return new DifferentPage(webDriver, softAssertions);
    }
}
