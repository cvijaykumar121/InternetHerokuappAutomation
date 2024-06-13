package com.orangehrm.web.pages.BrokenImages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BrokenImagesLocators {
    public BrokenImagesLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
