package com.orangehrm.web.pages.DynamicContent;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class DynamicContentPage extends TestBase {
    public WebDriver driver;
    public DynamicContentLocators dynamicContentLocators;

    public DynamicContentPage(WebDriver driver) {
        this.driver = driver;
        this.dynamicContentLocators = new DynamicContentLocators(driver);
    }
}
