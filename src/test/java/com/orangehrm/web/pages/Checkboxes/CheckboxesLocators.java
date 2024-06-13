package com.orangehrm.web.pages.Checkboxes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckboxesLocators {
    public CheckboxesLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3[text()='Checkboxes']")
    public WebElement checkboxPageTitle;

    @FindBy(xpath = "//form[@id='checkboxes']/input")
    public List<WebElement> allCheckboxes;
}
