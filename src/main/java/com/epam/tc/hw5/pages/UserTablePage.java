package com.epam.tc.hw5.pages;

import java.util.List;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class UserTablePage extends BasePage {

    public UserTablePage (WebDriver driver, SoftAssertions softAssertions) {
        super(driver, softAssertions);
    }

    @FindBy(xpath = "//tbody/tr/td")
    public List <WebElement> userInformationWithNumber;

    @FindBy(xpath = "//td//a[@href='']")
    public List <WebElement> usernameList;

    @FindBy(xpath = "//td/select")
    public List<WebElement> userInformation;

    @FindBy(xpath = "//div/input[@type = 'checkbox']")
    public List<WebElement> checkboxList;

    @FindBy(xpath = "//div[@class='user-descr']/span")
    public List<WebElement> descriptionList;

    @FindBy(id = "ivan")
    public WebElement checkboxIvan;

    @FindBy(xpath = "//li[contains(text(),'Vip: condition changed to true')]")
    public WebElement logForCheckbox;

    int countPasses;

    public void verifyNumberTypesIsDisplayed() {
        countPasses = 0;
        for (int i = 0; i < userInformationWithNumber.size();) {
            softAssertions.assertThat(userInformationWithNumber.get(i).isDisplayed());
            i+=4;
            countPasses++;
        }
        softAssertions.assertThat(countPasses).isEqualTo(6);
    }

    public void verifyUsernamesIsDisplayed () {
        verifyDisplayedItemList(usernameList);
    }

    public void verifyDisplayedDescription () {
        verifyDisplayedItemList(userInformation);
    }

    public void verifyDisplayedCheckboxes () {
        verifyDisplayedItemList(checkboxList);
    }

    private void verifyDisplayedItemList (List <WebElement> listElements) {
        countPasses = 0;
        for (WebElement item : listElements) {
            softAssertions.assertThat(item.isDisplayed());
            countPasses++;
        }
        softAssertions.assertThat(countPasses).isEqualTo(6);
    }

    public void verifyUserInformation (List<String> userInformationList) {
        for (int i = 3; i < userInformationList.size();) {
            verifyNumberType(userInformationList.get(i));
            verifyUser(userInformationList.get(i+1));
            verifyDescription(userInformationList.get(i+2));
            i+=3;
        }
    }

    private void verifyNumberType(String expected) {
        for (int i = 0; i < userInformationWithNumber.size();) {
            if (expected.equals(userInformationWithNumber.get(i).getText())) {
                softAssertions.assertThat(userInformationWithNumber.get(i).isDisplayed());
                return;
            }
            i+=4;
        }
        Assert.fail("verify Number type fail");
    }

    private void verifyUser(String expected) {
        for (WebElement actualUser : usernameList) {
            if (actualUser.getText().equals(expected)) {
                softAssertions.assertThat(actualUser.isDisplayed());
                return;
            }
        }
        Assert.fail("verify User fail");
    }

    private void verifyDescription(String expected) {
        for (WebElement item : descriptionList) {
            if (item.getText().replaceAll("\n"," ").equals(expected)) {
                softAssertions.assertThat(item.isDisplayed());
                return;
            }
        }
        Assert.fail("verify Description fail");
    }

    public void verifyDroplistInformationForUserRoman(List <String> informationForUserRoman) {
        for (int i = 0; i<userInformationWithNumber.size();) {
            if (userInformationWithNumber.get(i).getText().equals("1")) {
                softAssertions.assertThat(userInformationWithNumber.get(i+1).getText())
                        .isEqualTo(informationForUserRoman.get(0));
                softAssertions.assertThat(userInformationWithNumber.get(i+2).getText())
                        .isEqualTo(informationForUserRoman.get(1));
                softAssertions.assertThat(userInformationWithNumber.get(i+3).getText())
                        .isEqualTo(informationForUserRoman.get(2));
                return;
            }
            i+=4;
        }
        Assert.fail("verify droplist information for user Roman fail");
    }

    public void selectVipCheckboxForUserIvan() {
        checkboxIvan.click();
    }

    public void verifyLogForCheckboxIsDisplayed() {
        softAssertions.assertThat(logForCheckbox.isDisplayed());
    }
}
