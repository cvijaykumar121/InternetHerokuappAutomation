package com.orangehrm.web.pages.ShadowDOM;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class ShadowDOMPage extends TestBase {
    public WebDriver driver;
    public ShadowDOMLocators shadowDOMLocators;

    public ShadowDOMPage(WebDriver driver) {
        this.driver = driver;
        this.shadowDOMLocators = new ShadowDOMLocators(driver);
    }
}
