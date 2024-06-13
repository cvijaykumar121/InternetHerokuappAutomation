package com.orangehrm.web.pages.JavascriptAlerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class JavascriptAlertsLocators {
    public JavascriptAlertsLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
