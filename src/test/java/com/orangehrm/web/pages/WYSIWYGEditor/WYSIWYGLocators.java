package com.orangehrm.web.pages.WYSIWYGEditor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WYSIWYGLocators {
    public WYSIWYGLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
