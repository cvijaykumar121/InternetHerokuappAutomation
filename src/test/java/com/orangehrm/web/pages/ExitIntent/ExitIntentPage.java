package com.orangehrm.web.pages.ExitIntent;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class ExitIntentPage extends TestBase {
    public WebDriver driver;
    public ExitIntentLocators exitIntentLocators;

    public ExitIntentPage(WebDriver driver) {
        this.driver = driver;
        this.exitIntentLocators = new ExitIntentLocators(driver);
    }
}
