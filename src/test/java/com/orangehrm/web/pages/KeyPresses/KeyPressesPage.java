package com.orangehrm.web.pages.KeyPresses;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage extends TestBase {
    public WebDriver driver;
    public KeyPressesLocators keyPressesLocators;

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
        this.keyPressesLocators = new KeyPressesLocators(driver);
    }
}
