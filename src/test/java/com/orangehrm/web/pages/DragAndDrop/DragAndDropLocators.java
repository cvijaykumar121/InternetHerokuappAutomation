package com.orangehrm.web.pages.DragAndDrop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropLocators {
    public DragAndDropLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
