package com.orangehrm.web.pages.DisappearingElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DisappearingElementsLocators {
    public DisappearingElementsLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
