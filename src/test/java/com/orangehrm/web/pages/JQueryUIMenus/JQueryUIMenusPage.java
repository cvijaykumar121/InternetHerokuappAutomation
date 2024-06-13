package com.orangehrm.web.pages.JQueryUIMenus;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class JQueryUIMenusPage extends TestBase {
    public WebDriver driver;
    public JQueryUIMenusLocators jQueryUIMenusLocators;

    public JQueryUIMenusPage(WebDriver driver) {
        this.driver = driver;
        this.jQueryUIMenusLocators = new JQueryUIMenusLocators(driver);
    }
}
