package com.orangehrm.web.pages.LargeAndDeepDOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LargeAndDeepDOMLocators {
    public LargeAndDeepDOMLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
