package com.openlending.pages;

import com.openlending.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedIN_Page {

    public LinkedIN_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "h4.top-card-layout__second-subline")
    public WebElement slogan;

}
