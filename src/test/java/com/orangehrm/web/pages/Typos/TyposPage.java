package com.orangehrm.web.pages.Typos;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class TyposPage extends TestBase {
    public WebDriver driver;
    public TyposLocators typosLocators;

    public TyposPage(WebDriver driver) {
        this.driver = driver;
        this.typosLocators = new TyposLocators(driver);
    }
}
