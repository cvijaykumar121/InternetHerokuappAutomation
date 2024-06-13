package com.orangehrm.web.pages.DisappearingElements;

import com.orangehrm.web.base.TestBase;
import com.orangehrm.web.pages.ContextMenu.ContextMenuLocators;
import org.openqa.selenium.WebDriver;

public class DisappearingElementsPage extends TestBase {
    public WebDriver driver;
    public DisappearingElementsLocators disappearingElementsLocators;

    public DisappearingElementsPage(WebDriver driver) {
        this.driver = driver;
        this.disappearingElementsLocators = new DisappearingElementsLocators(driver);
    }
}
