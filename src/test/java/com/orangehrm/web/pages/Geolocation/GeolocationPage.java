package com.orangehrm.web.pages.Geolocation;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class GeolocationPage extends TestBase {
    public WebDriver driver;
    public GeolocationLocators geolocationLocators;

    public GeolocationPage(WebDriver driver) {
        this.driver = driver;
        this.geolocationLocators = new GeolocationLocators(driver);
    }
}
