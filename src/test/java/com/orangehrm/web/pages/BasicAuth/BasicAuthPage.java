package com.orangehrm.web.pages.BasicAuth;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class BasicAuthPage extends TestBase {
    public WebDriver driver;
    public BasicAuthLocators basicAuthLocators;

    public BasicAuthPage(WebDriver driver) {
        this.driver = driver;
        this.basicAuthLocators = new BasicAuthLocators(driver);
    }
}
