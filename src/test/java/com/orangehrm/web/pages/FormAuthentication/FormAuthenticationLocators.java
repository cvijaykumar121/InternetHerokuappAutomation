package com.orangehrm.web.pages.FormAuthentication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FormAuthenticationLocators {
    public FormAuthenticationLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
