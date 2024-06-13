package com.orangehrm.web.pages.DynamicControls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsLocators {
    public DynamicControlsLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
