package com.openlending.pages;

import com.openlending.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google_Page {

    public Google_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "input.gLFyf.gsfi")
    public WebElement searchBox;

    @FindBy(className = "gNO89b")
    public WebElement googleSearchButton;

    @FindBy(xpath = "//a[contains(@href,'linkedin.com/company/open-lending')]")
    public WebElement openLendingLinkedIN;


}
