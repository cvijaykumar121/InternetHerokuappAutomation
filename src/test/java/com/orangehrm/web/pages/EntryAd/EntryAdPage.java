package com.orangehrm.web.pages.EntryAd;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class EntryAdPage extends TestBase {
    public WebDriver driver;
    public EntryAdLocators entryAdLocators;

    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
        this.entryAdLocators = new EntryAdLocators(driver);
    }
}
