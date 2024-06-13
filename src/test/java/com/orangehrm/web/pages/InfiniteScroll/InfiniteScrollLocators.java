package com.orangehrm.web.pages.InfiniteScroll;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InfiniteScrollLocators {
    public InfiniteScrollLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
