package com.orangehrm.web.pages.SortableDataTables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SortableDataTablesLocators {
    public SortableDataTablesLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
