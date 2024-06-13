package com.orangehrm.web.testcases;

import com.orangehrm.web.base.TestBase;
import com.orangehrm.web.pages.ContextMenu.ContextMenuPage;
import org.testng.annotations.Test;

public class ContextMenuTest extends TestBase {

    @Test(priority = 1)
    public void validateContextMenuHeader() {
        ContextMenuPage contextMenuPage = new ContextMenuPage(driver);
        homePage.clickOnContextMenuLink();
        contextMenuPage.validateContextMenuHeader();
    }

    @Test(priority = 2)
    public void validateContextMenuDescription1() {
        ContextMenuPage contextMenuPage = new ContextMenuPage(driver);
        homePage.clickOnContextMenuLink();
        contextMenuPage.validateDescription1();
    }

    @Test(priority = 3)
    public void validateContextMenuDescription2() {
        ContextMenuPage contextMenuPage = new ContextMenuPage(driver);
        homePage.clickOnContextMenuLink();
        contextMenuPage.validateDescription2();
    }

    @Test(priority = 4)
    public void validateContextMenuFunctionality() {
        ContextMenuPage contextMenuPage = new ContextMenuPage(driver);
        homePage.clickOnContextMenuLink();
        contextMenuPage.validateContextMenuFunctionality();
    }
}
