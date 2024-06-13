package com.orangehrm.web.pages.SlowResources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SlowResourcesLocators {
    public SlowResourcesLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
