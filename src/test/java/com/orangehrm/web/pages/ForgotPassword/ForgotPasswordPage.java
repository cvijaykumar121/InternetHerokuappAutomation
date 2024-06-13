package com.orangehrm.web.pages.ForgotPassword;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage extends TestBase {
    public WebDriver driver;
    public ForgotPasswordLocators forgotPasswordLocators;

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
        this.forgotPasswordLocators = new ForgotPasswordLocators(driver);
    }
}
