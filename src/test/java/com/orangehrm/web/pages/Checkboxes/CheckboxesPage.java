package com.orangehrm.web.pages.Checkboxes;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CheckboxesPage extends TestBase {
    public WebDriver driver;
    public CheckboxesLocators checkboxesLocators;

    public CheckboxesPage(WebDriver driver) {
        this.driver = driver;
        this.checkboxesLocators = new CheckboxesLocators(driver);
    }

    public void verifyTitle() {
        String expectedTitle = "The Internet";
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    public void validatePageTitle() {
        String expectedTitle = "Checkboxes";
        WebElement checkboxPageTitle = checkboxesLocators.checkboxPageTitle;
        System.out.println("Actual Title of page: " + checkboxPageTitle);
        validateText(checkboxPageTitle, expectedTitle, "Validated Page Title Successfully", 5);
    }

    public void verifyPresenceOfCheckboxes() {
        List<WebElement> checkboxes = checkboxesLocators.allCheckboxes;
        System.out.println("Total Checkboxes: " + checkboxes.size());
        Assert.assertEquals(2, checkboxes.size());
    }

    public void verifyDefaultStateOfCheckboxes() {
        List<WebElement> checkboxes = checkboxesLocators.allCheckboxes;
        Assert.assertFalse(checkboxes.get(0).isSelected());
        Assert.assertTrue(checkboxes.get(1).isSelected());
    }

    public void checkCheckbox() {
        List<WebElement> allCheckboxes = checkboxesLocators.allCheckboxes;
        if (!allCheckboxes.get(0).isSelected()) {
            allCheckboxes.get(0).click();
        }
        Assert.assertTrue(allCheckboxes.get(0).isSelected());
    }

    public void uncheckCheckbox() {
        List<WebElement> allCheckboxes = checkboxesLocators.allCheckboxes;
        if (allCheckboxes.get(1).isSelected()) {
            allCheckboxes.get(1).click();
        }
        Assert.assertFalse(allCheckboxes.get(1).isSelected());
    }
}
