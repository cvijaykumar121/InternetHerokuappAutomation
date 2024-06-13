package com.orangehrm.web.pages.KeyPresses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class KeyPressesLocators {
    public KeyPressesLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
