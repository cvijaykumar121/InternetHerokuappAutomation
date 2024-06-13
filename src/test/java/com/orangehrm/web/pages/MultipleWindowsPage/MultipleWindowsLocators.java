package com.orangehrm.web.pages.MultipleWindowsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MultipleWindowsLocators {
    public MultipleWindowsLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
