package com.orangehrm.web.pages.AddRemoveElements;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class AddRemoveElementsPage extends TestBase {
    public WebDriver driver;
    public AddRemoveElementsLocators addRemoveElementsLocators;

    public AddRemoveElementsPage(WebDriver driver) {
        this.driver = driver;
        this.addRemoveElementsLocators = new AddRemoveElementsLocators(driver);
    }

    public void validateAddRemovePageHeader() {
        waitForElementToBeVisible(addRemoveElementsLocators.addRemoveElementHeader, 10);
        validateText(addRemoveElementsLocators.addRemoveElementHeader, "Add/Remove Elements", "Successfully validated header", 10);
    }

    public void validateAddElementFunctionality() throws InterruptedException {
        List<WebElement> allDeleteButtons = addRemoveElementsLocators.deleteButtons;
        int numberOfDeleteButtons = 0;

        waitForElementToBeVisible(addRemoveElementsLocators.addElementButton, 5);
        System.out.println("Number of delete buttons initially: " + allDeleteButtons.size());
        if(allDeleteButtons.size() == 0) {
            for(int i=0; i<20; i++) {
                clickElement(addRemoveElementsLocators.addElementButton, "Button clicked", true, 10);
                numberOfDeleteButtons++;
                Assert.assertEquals(allDeleteButtons.size(), numberOfDeleteButtons);
            }
        }
    }
}
