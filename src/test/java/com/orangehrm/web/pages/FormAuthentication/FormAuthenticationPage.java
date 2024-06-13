package com.orangehrm.web.pages.FormAuthentication;

import org.openqa.selenium.WebDriver;

public class FormAuthenticationPage {
    public WebDriver driver;
    public FormAuthenticationLocators formAuthenticationLocators;

    public FormAuthenticationPage(WebDriver driver) {
        this.driver = driver;
        this.formAuthenticationLocators = new FormAuthenticationLocators(driver);
    }
}
