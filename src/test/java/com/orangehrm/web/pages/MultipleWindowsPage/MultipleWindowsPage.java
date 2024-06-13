package com.orangehrm.web.pages.MultipleWindowsPage;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage extends TestBase {
    public WebDriver driver;
    public MultipleWindowsLocators multipleWindowsLocators;

    public MultipleWindowsPage(WebDriver driver) {
        this.driver = driver;
        this.multipleWindowsLocators = new MultipleWindowsLocators(driver);
    }
}
