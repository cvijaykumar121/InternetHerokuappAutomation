package com.orangehrm.web.pages.WYSIWYGEditor;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage extends TestBase {
    public WebDriver driver;
    public WYSIWYGLocators wysiwygLocators;

    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
        this.wysiwygLocators = new WYSIWYGLocators(driver);
    }
}
