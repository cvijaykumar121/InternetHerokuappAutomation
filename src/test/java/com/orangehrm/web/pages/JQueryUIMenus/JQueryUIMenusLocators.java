package com.orangehrm.web.pages.JQueryUIMenus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class JQueryUIMenusLocators {
    public JQueryUIMenusLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
