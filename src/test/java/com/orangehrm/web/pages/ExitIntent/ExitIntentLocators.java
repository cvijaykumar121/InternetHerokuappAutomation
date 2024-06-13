package com.orangehrm.web.pages.ExitIntent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ExitIntentLocators {
    public ExitIntentLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
