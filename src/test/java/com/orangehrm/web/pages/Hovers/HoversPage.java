package com.orangehrm.web.pages.Hovers;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class HoversPage extends TestBase {
    public WebDriver driver;
    public HoversLocators hoversLocators;

    public HoversPage(WebDriver driver) {
        this.driver = driver;
        this.hoversLocators = new HoversLocators(driver);
    }
}
