package com.orangehrm.web.pages.AddRemoveElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddRemoveElementsLocators {
    public AddRemoveElementsLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3[text()='Add/Remove Elements']")
    public WebElement addRemoveElementHeader;

    @FindBy(xpath = "//button[text()='Add Element']")
    public WebElement addElementButton;

    @FindBy(xpath = "//div[@id='elements']/*")
    public List<WebElement> deleteButtons;
}
