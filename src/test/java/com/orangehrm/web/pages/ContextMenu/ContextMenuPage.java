package com.orangehrm.web.pages.ContextMenu;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends TestBase {
    public WebDriver driver;
    public ContextMenuLocators contextMenuLocators;

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
        this.contextMenuLocators = new ContextMenuLocators(driver);
    }

    public void validateContextMenuHeader() {
        validateText(contextMenuLocators.contextMenuHeader, "Context Menu", "Validated context menu heading successfully", 10);
    }

    public void validateDescription1() {
        validateText(contextMenuLocators.contextMenuDescription1, "Context menu items are custom additions that appear in the right-click menu.",
                "Validated context menu description 1 successfully", 10);
    }

    public void validateDescription2() {
        validateText(contextMenuLocators.contextMenuDescription2, "Right-click in the box below to see one called 'the-internet'. When you click it, it will trigger a JavaScript alert.",
                "Validated context menu description 2 successfully", 10);
    }

    public void validateContextMenuFunctionality() {
        WebElement elementToRightClick = contextMenuLocators.contextMenuBox;
        Actions actions = new Actions(driver);
        actions.contextClick(elementToRightClick).perform();

        try {
            handleAlert();
        } catch (UnhandledAlertException e) {
            // Handle the unexpected alert
            handleAlert();
        }
    }

    private void handleAlert() {
        try {
            Alert alert = driver.switchTo().alert();

            // Validate the alert text
            String expectedAlertText = "You selected a context menu";
            String actualAlertText = alert.getText();
            if (expectedAlertText.equals(actualAlertText)) {
                logPass("Alert text validated successfully", true);
            } else {
                logFail("Alert text is not validated correctly", true);
            }

            // Accept the alert (click OK button)
            alert.accept();
        } catch (Exception e) {
            System.out.println("No alert found to handle.");
        }
    }
}
