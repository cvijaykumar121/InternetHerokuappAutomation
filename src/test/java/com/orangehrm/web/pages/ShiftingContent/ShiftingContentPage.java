package com.orangehrm.web.pages.ShiftingContent;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class ShiftingContentPage extends TestBase {
    public WebDriver driver;
    public ShiftingContentLocators shiftingContentLocators;

    public ShiftingContentPage(WebDriver driver) {
        this.driver = driver;
        this.shiftingContentLocators = new ShiftingContentLocators(driver);
    }
}
