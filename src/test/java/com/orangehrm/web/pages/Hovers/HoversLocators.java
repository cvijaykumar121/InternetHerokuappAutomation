package com.orangehrm.web.pages.Hovers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HoversLocators {
    public HoversLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
