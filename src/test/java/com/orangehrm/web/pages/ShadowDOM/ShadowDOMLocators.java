package com.orangehrm.web.pages.ShadowDOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShadowDOMLocators {
    public ShadowDOMLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
