package com.orangehrm.web.pages.NestedFrames;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage extends TestBase {
    public WebDriver driver;
    public NestedFramesLocators nestedFramesLocators;

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
        this.nestedFramesLocators = new NestedFramesLocators(driver);
    }
}
