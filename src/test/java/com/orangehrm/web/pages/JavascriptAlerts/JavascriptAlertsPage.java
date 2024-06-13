package com.orangehrm.web.pages.JavascriptAlerts;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class JavascriptAlertsPage extends TestBase {
    public WebDriver driver;
    public JavascriptAlertsLocators javascriptAlertsLocators;

    public JavascriptAlertsPage(WebDriver driver) {
        this.driver = driver;
        this.javascriptAlertsLocators = new JavascriptAlertsLocators(driver);
    }
}
