package com.orangehrm.web.pages.EntryAd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EntryAdLocators {
    public EntryAdLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
