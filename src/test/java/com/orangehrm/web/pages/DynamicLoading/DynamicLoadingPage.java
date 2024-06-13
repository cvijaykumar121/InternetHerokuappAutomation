package com.orangehrm.web.pages.DynamicLoading;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage extends TestBase {
    public WebDriver driver;
    public DynamicLoadingLocators dynamicLoadingLocators;

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
        this.dynamicLoadingLocators = new DynamicLoadingLocators(driver);
    }
}
