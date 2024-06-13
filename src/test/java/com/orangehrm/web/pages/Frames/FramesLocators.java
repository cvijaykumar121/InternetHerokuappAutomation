package com.orangehrm.web.pages.Frames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FramesLocators {
    public FramesLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
