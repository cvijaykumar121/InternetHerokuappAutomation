package com.orangehrm.web.pages.BasicAuth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasicAuthLocators {
    public BasicAuthLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
