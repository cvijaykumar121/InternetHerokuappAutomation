package com.orangehrm.web.pages.NestedFrames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NestedFramesLocators {
    public NestedFramesLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
