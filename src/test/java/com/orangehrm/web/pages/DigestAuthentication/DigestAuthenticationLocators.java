package com.orangehrm.web.pages.DigestAuthentication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DigestAuthenticationLocators {
    public DigestAuthenticationLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
