package com.epam.tc.hw5.pages;

import java.util.List;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserTablePage extends BasePage {

    public UserTablePage (WebDriver driver, SoftAssertions softAssertions) {
        super(driver, softAssertions);
    }

    @FindBy(xpath = "//tbody/tr//td")
    public List <WebElement> numberTypeList;

    @FindBy(xpath = "//td//a[@href='']")
    public List <WebElement> usernameList;

    @FindBy(xpath = "//td/select")
    public List<WebElement> descriptionList;

    @FindBy(xpath = "//div/input[@type = 'checkbox']")
    public List<WebElement> checkboxList;

    int countPasses;

    public void verifyNumberTypesIsDisplayed() {
        countPasses = 0;
        for (int i = 0; i < numberTypeList.size();) {
            softAssertions.assertThat(numberTypeList.get(i).isDisplayed());
            i+=4;
            countPasses++;
        }
        softAssertions.assertThat(countPasses).isEqualTo(6);
    }

    public void verifyUsernamesIsDisplayed () {
        verifyDisplayedItemList(usernameList);
    }

    public void verifyDisplayedDescription () {
        verifyDisplayedItemList(usernameList);
    }

    public void verifyDisplayedCheckboxes () {
        verifyDisplayedItemList(descriptionList);
    }

    private void verifyDisplayedItemList (List <WebElement> listElements) {
        countPasses = 0;
        for (WebElement item : listElements) {
            softAssertions.assertThat(item.isDisplayed());
            countPasses++;
        }
        softAssertions.assertThat(countPasses).isEqualTo(6);
    }
}
