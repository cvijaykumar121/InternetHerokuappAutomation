package com.orangehrm.web.pages.RedirectLink;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class RedirectLinkPage extends TestBase {
    public WebDriver driver;
    public RedirectLinkLocators redirectLinkLocators;

    public RedirectLinkPage(WebDriver driver) {
        this.driver = driver;
        this.redirectLinkLocators = new RedirectLinkLocators(driver);
    }
}
