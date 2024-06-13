package com.orangehrm.web.pages.Typos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TyposLocators {
    public TyposLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
