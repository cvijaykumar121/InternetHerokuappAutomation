package com.orangehrm.web.pages.RedirectLink;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RedirectLinkLocators {
    public RedirectLinkLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
