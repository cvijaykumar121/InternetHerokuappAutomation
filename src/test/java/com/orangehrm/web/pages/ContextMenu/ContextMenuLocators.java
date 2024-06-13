package com.orangehrm.web.pages.ContextMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContextMenuLocators {
    public ContextMenuLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3[text()='Context Menu']")
    public WebElement contextMenuHeader;

    @FindBy(xpath = "//p[text()='Context menu items are custom additions that appear in the right-click menu.']")
    public WebElement contextMenuDescription1;

    @FindBy(xpath = "//p[text()=\"Right-click in the box below to see one called 'the-internet'. When you click it, it will trigger a JavaScript alert.\"]")
    public WebElement contextMenuDescription2;

    @FindBy(xpath = "//div[@id='hot-spot']")
    public WebElement contextMenuBox;


}
