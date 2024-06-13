package com.orangehrm.web.pages.DynamicContent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DynamicContentLocators {
    public DynamicContentLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
