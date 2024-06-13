package com.orangehrm.web.pages.StatusCodes;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class StatusCodesPage extends TestBase {
    public WebDriver driver;
    public StatusCodesLocators statusCodesLocators;

    public StatusCodesPage(WebDriver driver) {
        this.driver = driver;
        this.statusCodesLocators = new StatusCodesLocators(driver);
    }
}
