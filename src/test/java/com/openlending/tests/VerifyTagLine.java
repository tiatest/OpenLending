package com.openlending.tests;

import com.openlending.utilities.ConfigurationReader;
import com.openlending.utilities.Driver;
import com.openlending.utilities.Pages;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class VerifyTagLine {

    Pages pages = new Pages();

    @Before
    public void setUp() {

        System.out.println("> SETTING UP THE DRIVER \n");

        Driver.getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        Driver.getDriver().manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        Driver.getDriver().manage().window().maximize();

    }

    @Test
    public void verifySlogan(){

        pages.getGoogle_page().searchBox.sendKeys("Open Lending");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        wait.until(ExpectedConditions.visibilityOf(pages.getGoogle_page().googleSearchButton));

        pages.getGoogle_page().googleSearchButton.click();

        pages.getGoogle_page().openLendingLinkedIN.click();

        String expectedSlogan = "Say YES to more automotive loans." ;

        String actualSlogan = pages.getLinkedIN_page().slogan.getText();

        Assert.assertTrue(expectedSlogan.equalsIgnoreCase(actualSlogan));

    }

    @After
    public void tearDown() {

        Driver.closeDriver();

        System.out.println("> CLOSING THE SESSION \n\n ******************* ");


    }


}
