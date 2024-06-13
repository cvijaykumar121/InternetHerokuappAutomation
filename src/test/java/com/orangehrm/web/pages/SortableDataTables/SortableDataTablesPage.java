package com.orangehrm.web.pages.SortableDataTables;

import org.openqa.selenium.WebDriver;

public class SortableDataTablesPage {
    public WebDriver driver;
    public SortableDataTablesLocators sortableDataTablesLocators;

    public SortableDataTablesPage(WebDriver driver) {
        this.driver = driver;
        this.sortableDataTablesLocators = new SortableDataTablesLocators(driver);
    }
}
