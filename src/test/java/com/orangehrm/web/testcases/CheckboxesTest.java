package com.orangehrm.web.testcases;

import com.orangehrm.web.base.TestBase;
import com.orangehrm.web.pages.Checkboxes.CheckboxesPage;
import org.testng.annotations.Test;

public class CheckboxesTest extends TestBase {
    @Test(priority = 1)
    public void validateTitleOfWebPage() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);

        homePage.clickOnCheckBoxesLink();
        checkboxesPage.verifyTitle();
    }

    @Test(priority = 2)
    public void validatePageTitle() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);

        homePage.clickOnCheckBoxesLink();
        checkboxesPage.validatePageTitle();
    }

    @Test(priority = 3)
    public void verifyPresenceOfCheckboxes() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);

        homePage.clickOnCheckBoxesLink();
        checkboxesPage.verifyPresenceOfCheckboxes();
    }

    @Test(priority = 4)
    public void verifyDefaultStateOfCheckboxes() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);

        homePage.clickOnCheckBoxesLink();
        checkboxesPage.verifyDefaultStateOfCheckboxes();
    }

    @Test(priority = 5)
    public void validateCheckCheckbox() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);

        homePage.clickOnCheckBoxesLink();
        checkboxesPage.checkCheckbox();
    }

    @Test(priority = 6)
    public void validateUncheckCheckbox() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);

        homePage.clickOnCheckBoxesLink();
        checkboxesPage.uncheckCheckbox();
    }
}
