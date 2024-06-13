package com.orangehrm.web.pages.DragAndDrop;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class DragAndDropPage extends TestBase {
    public WebDriver driver;
    public DragAndDropLocators dragAndDropLocators;

    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
        this.dragAndDropLocators = new DragAndDropLocators(driver);
    }
}
