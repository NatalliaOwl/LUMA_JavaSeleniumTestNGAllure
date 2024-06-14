package com.lumatest.test;

import com.lumatest.base.BaseTest;
import com.lumatest.data.TestData;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

    @Test(description = "TC-01 Open Base URL")
    @Story("Navigation")
    @Severity(SeverityLevel.BLOCKER)
    @Description("To verify that the Base URL and Title of the application are correct and as expected.")
    @Link(TestData.BASE_URL)
    public void testOpenBaseURL() {
        Allure.step("Setup expected results");
        final String expectedURL = TestData.BASE_URL + "/";
        final String expectedTitle = TestData.BASE_URL_TITLE;

        Allure.step("Open BaseURL");
        getDriver().get(TestData.BASE_URL);

        Allure.step("Collect actualURL, actualTitle");
        final String actualURL = getDriver().getCurrentUrl();
        final String actualTitle = getDriver().getTitle();

        Allure.step("Verify actualURL as expected");
        Assert.assertEquals(actualURL, expectedURL);
        Allure.step("Verify actualTitle as expected");
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(
            description = "TC-02 Top Menu Navigation",
            dataProvider = "navigationData",
            dataProviderClass = TestData.class
    )
    @Story("Navigation")
    @Severity(SeverityLevel.CRITICAL)
    @Description("To verify that the Top Menu Navigation on the website functions correctly by ensuring that " +
            "clicking on menu items directs the user to the expected URL with the expected Title.")
    @Link(TestData.BASE_URL)
    public void testNavigationMenu(String baseURL, By navBarMenu, String expectedURL, String expectedTitle) {

        Allure.step("Open Base URL");
        getDriver().get(baseURL);

        Allure.step("Click on " + navBarMenu.toString());
        getDriver().findElement(navBarMenu).click();

        Allure.step("Collect actualURL, actualTitle");
        final String actualURL = getDriver().getCurrentUrl();
        final String actualTitle = getDriver().getTitle();

        Allure.step("Verify actualURL as expected");
        Assert.assertEquals(actualURL, expectedURL);
        Allure.step("Verify actualTitle as expected");
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
