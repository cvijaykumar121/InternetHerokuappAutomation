package com.orangehrm.web.pages.DigestAuthentication;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class DigestAuthenticationPage extends TestBase {
    public WebDriver driver;
    public DigestAuthenticationLocators digestAuthenticationLocators;

    public DigestAuthenticationPage(WebDriver driver) {
        this.driver = driver;
        this.digestAuthenticationLocators = new DigestAuthenticationLocators(driver);
    }
}
