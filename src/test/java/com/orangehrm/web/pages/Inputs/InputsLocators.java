package com.orangehrm.web.pages.Inputs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InputsLocators {
    public InputsLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
