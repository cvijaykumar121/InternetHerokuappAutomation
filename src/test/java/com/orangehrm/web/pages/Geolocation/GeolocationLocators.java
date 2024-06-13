package com.orangehrm.web.pages.Geolocation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GeolocationLocators {
    public GeolocationLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
