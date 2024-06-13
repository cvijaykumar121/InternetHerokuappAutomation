package com.orangehrm.web.pages.ForgotPassword;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordLocators {
    public ForgotPasswordLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
