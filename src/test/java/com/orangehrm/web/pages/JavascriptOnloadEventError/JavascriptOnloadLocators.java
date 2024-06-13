package com.orangehrm.web.pages.JavascriptOnloadEventError;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class JavascriptOnloadLocators {
    public JavascriptOnloadLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
