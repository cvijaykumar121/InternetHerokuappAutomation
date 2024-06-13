package com.orangehrm.web.pages.HorizontalSlider;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage extends TestBase {
    public WebDriver driver;
    public HorizontalSliderLocators horizontalSliderLocators;

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
        this.horizontalSliderLocators = new HorizontalSliderLocators(driver);
    }
}
