package com.orangehrm.web.pages.DynamicLoading;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadingLocators {
    public DynamicLoadingLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
