package com.orangehrm.web.pages.FloatingMenu;

import com.orangehrm.web.base.TestBase;
import com.orangehrm.web.pages.ContextMenu.ContextMenuLocators;
import org.openqa.selenium.WebDriver;

public class FloatingMenuPage extends TestBase {
    public WebDriver driver;
    public FloatingMenuLocators floatingMenuLocators;

    public FloatingMenuPage(WebDriver driver) {
        this.driver = driver;
        this.floatingMenuLocators = new FloatingMenuLocators(driver);
    }
}
