package com.orangehrm.web.pages.ChallengingDOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ChallengingDOMLocators {
    public ChallengingDOMLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
