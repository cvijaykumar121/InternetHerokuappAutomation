package com.orangehrm.web.pages.StatusCodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class StatusCodesLocators {
    public StatusCodesLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
