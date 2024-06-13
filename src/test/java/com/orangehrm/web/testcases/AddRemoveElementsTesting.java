package com.orangehrm.web.testcases;

import com.orangehrm.web.base.TestBase;
import com.orangehrm.web.pages.AddRemoveElements.AddRemoveElementsPage;
import org.testng.annotations.Test;

public class AddRemoveElementsTesting extends TestBase {

    @Test(priority = 1)
    public void validateAddRemoveElementsHeaderIsPresent() {
        AddRemoveElementsPage addRemoveElementsPage = new AddRemoveElementsPage(driver);

        homePage.clickOnAddRemoveElementsLink();
        addRemoveElementsPage.validateAddRemovePageHeader();
    }

    @Test(priority = 2)
    public void validateAddButtonFunctionality() throws InterruptedException {
        AddRemoveElementsPage addRemoveElementsPage = new AddRemoveElementsPage(driver);

        homePage.clickOnAddRemoveElementsLink();
        addRemoveElementsPage.validateAddElementFunctionality();
    }
}
