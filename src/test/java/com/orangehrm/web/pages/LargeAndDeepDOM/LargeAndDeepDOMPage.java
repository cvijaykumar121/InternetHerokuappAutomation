package com.orangehrm.web.pages.LargeAndDeepDOM;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class LargeAndDeepDOMPage extends TestBase {
    public WebDriver driver;
    public LargeAndDeepDOMLocators largeAndDeepDOMLocators;

    public LargeAndDeepDOMPage(WebDriver driver) {
        this.driver = driver;
        this.largeAndDeepDOMLocators = new LargeAndDeepDOMLocators(driver);
    }
}
