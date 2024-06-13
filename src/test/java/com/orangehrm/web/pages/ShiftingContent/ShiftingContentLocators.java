package com.orangehrm.web.pages.ShiftingContent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShiftingContentLocators {
    public ShiftingContentLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
