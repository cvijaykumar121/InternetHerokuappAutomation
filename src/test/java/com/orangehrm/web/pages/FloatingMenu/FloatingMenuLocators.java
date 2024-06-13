package com.orangehrm.web.pages.FloatingMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FloatingMenuLocators {
    public FloatingMenuLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
