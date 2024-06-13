package com.orangehrm.web.pages.SlowResources;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class SlowResourcesPage extends TestBase {
    public WebDriver driver;
    public SlowResourcesLocators slowResourcesLocators;

    public SlowResourcesPage(WebDriver driver) {
        this.driver = driver;
        this.slowResourcesLocators = new SlowResourcesLocators(driver);
    }
}
