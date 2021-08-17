package com.epam.tc.hw2.ex1;

import com.epam.tc.hw2.ConfProperties;
import com.epam.tc.hw2.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ExerciseOneTest extends TestBase {

    @Test
    public void testExerciseOne() {
        //1. Open  test site by URL
        webDriver.navigate().to(ConfProperties.getProperty("url"));

        //2. Assert Browser title
        String pageTitle = "Home Page";
        softAssertions.assertThat(pageTitle)
                .as("wrong title")
                .isEqualTo(webDriver.getTitle());

        //3. Perform login
        webDriver.findElement(By.cssSelector("li.dropdown:nth-child(1) > a:nth-child(1)")).click();
        webDriver.findElement(By.id("name")).sendKeys(ConfProperties.getProperty("username"));
        webDriver.findElement(By.id("password")).sendKeys(ConfProperties.getProperty("password"));
        webDriver.findElement(By.id("login-button")).click();

        //4. Assert Username is loggined
        String usernameAfterLogin = "ROMAN IOVLEV";
        softAssertions.assertThat(usernameAfterLogin)
            .as("login failed")
            .isEqualTo(webDriver.findElement(By.id("user-name")).getText());

        //5. Assert that there are 4 items on the header sections are displayed and they have proper texts
        String homeBarName = "HOME";
        String contactFormBarName = "CONTACT FORM";
        String serviceBarName = "SERVICE";
        String metalsAndColorsBarName = "METALS & COLORS";

        softAssertions.assertThat(homeBarName)
                .as("wrong name for 'home' bar")
                .isEqualTo(webDriver.findElement(By.linkText("HOME")).getText());
        softAssertions.assertThat(contactFormBarName)
                .as("wrong name for 'contact' bar")
                .isEqualTo(webDriver.findElement(By.linkText("CONTACT FORM")).getText());
        softAssertions.assertThat(serviceBarName)
                .as("wrong name for 'service' bar")
                .isEqualTo(webDriver.findElement(By.linkText("SERVICE")).getText());
        softAssertions.assertThat(metalsAndColorsBarName)
                .as("wrong name for 'metals and colors' bar")
                .isEqualTo(webDriver.findElement(By.linkText("METALS & COLORS")).getText());

        //6. Assert that there are 4 images on the Index Page and they are displayed
        WebElement baseIconElement = webDriver.findElement(By.className("icon-base"));
        WebElement practiseIconElement = webDriver.findElement(By.className("icon-practise"));
        WebElement multiIconElement = webDriver.findElement(By.className("icon-multi"));
        WebElement customIconElement = webDriver.findElement(By.className("icon-custom"));

        softAssertions.assertThat(baseIconElement.isDisplayed()).isTrue();
        softAssertions.assertThat(practiseIconElement.isDisplayed()).isTrue();
        softAssertions.assertThat(multiIconElement.isDisplayed()).isTrue();
        softAssertions.assertThat(customIconElement.isDisplayed()).isTrue();

        //7. Assert that there are 4 texts on the Index Page under icons and they have proper text
        String textUnderPractiseIcon = "To include good practices\n" + "and ideas from successful\n" + "EPAM project";
        String textUnderCustomIcon = "To be flexible and\n" + "customizable";
        String textUnderMultiIcon = "To be multiplatform";
        String textUnderBaseIcon = "Already have good base\n" + "(about 20 internal and\n"
                + "some external projects),\n"
                + "wish to get more…";

        String textUnderPractiseIconActual = webDriver.findElement(By.xpath(
                "//span[starts-with(text(),'To include good practices')]")).getText();
        String textUnderCustomIconActual = webDriver.findElement(By.xpath(
                "//span[starts-with(text(),'To be flexible')]")).getText();
        String textUnderMultiIconActual = webDriver.findElement(By.xpath(
                "//span[starts-with(text(),'To be multiplatform')]")).getText();
        String textUnderBaseIconActual = webDriver.findElement(By.xpath(
                "//span[starts-with(text(),'Already have good')]")).getText();

        softAssertions.assertThat(textUnderPractiseIcon).isEqualTo(textUnderPractiseIconActual);
        softAssertions.assertThat(textUnderBaseIcon).isEqualTo(textUnderBaseIconActual);
        softAssertions.assertThat(textUnderCustomIcon).isEqualTo(textUnderCustomIconActual);
        softAssertions.assertThat(textUnderMultiIcon).isEqualTo(textUnderMultiIconActual);

        //8. Assert that there is the iframe with “Frame Button” exist
        WebElement frameElement = webDriver.findElement(By.id("frame"));
        softAssertions.assertThat(frameElement.isDisplayed()).isTrue();

        //9. Switch to the iframe and check that there is “Frame Button” in the iframe
        webDriver.switchTo().frame("frame");
        WebElement element = webDriver.findElement(By.id("frame-button"));
        softAssertions.assertThat(element.isDisplayed()).isTrue();

        //10. Switch to original window back
        String windowHandler = webDriver.getWindowHandle();
        webDriver.switchTo().window(windowHandler);

        //11. Assert that there are 5 items in the Left Section are displayed and they have proper text
        String titleHome = "Home";
        String titleService = "Service";
        String titleContactForm = "Contact form";
        String titleMetalsAndColors = "Metals & Colors";
        String titleElementsPacks = "Elements packs";

        softAssertions.assertThat(titleHome).isEqualTo(
                webDriver.findElement(By.xpath("//span[text() = 'Home']")).getText());
        softAssertions.assertThat(titleService).isEqualTo(
                webDriver.findElement(By.xpath("//span[text() = 'Service']")).getText());
        softAssertions.assertThat(titleContactForm).isEqualTo(
                webDriver.findElement(By.xpath("//span[text() = 'Contact form']")).getText());
        softAssertions.assertThat(titleMetalsAndColors).isEqualTo(
                webDriver.findElement(By.xpath("//span[text() = 'Metals & Colors']")).getText());
        softAssertions.assertThat(titleElementsPacks).isEqualTo(
                webDriver.findElement(By.xpath("//span[text() = 'Elements packs']")).getText());

        softAssertions.assertAll();
    }
}
