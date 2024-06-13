package com.orangehrm.web.pages.Dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DropdownLocators {
    public DropdownLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
