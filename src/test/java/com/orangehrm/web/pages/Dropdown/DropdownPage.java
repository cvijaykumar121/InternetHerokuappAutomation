package com.orangehrm.web.pages.Dropdown;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class DropdownPage extends TestBase {
    public WebDriver driver;
    public DropdownLocators dropdownLocators;

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
        this.dropdownLocators = new DropdownLocators(driver);
    }
}
