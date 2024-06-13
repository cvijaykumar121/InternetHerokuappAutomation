package com.orangehrm.web.pages.DynamicControls;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class DynamicControlsPage extends TestBase {
    public WebDriver driver;
    public DynamicControlsLocators dynamicControlsLocators;

    public DynamicControlsPage(WebDriver driver) {
        this.driver = driver;
        this.dynamicControlsLocators = new DynamicControlsLocators(driver);
    }
}
