package com.orangehrm.web.pages.Frames;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class FramesPage extends TestBase {
    public WebDriver driver;
    public FramesLocators framesLocators;

    public FramesPage(WebDriver driver) {
        this.driver = driver;
        this.framesLocators = new FramesLocators(driver);
    }
}
