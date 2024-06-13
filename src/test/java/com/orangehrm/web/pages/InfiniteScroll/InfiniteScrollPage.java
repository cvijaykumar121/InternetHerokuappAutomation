package com.orangehrm.web.pages.InfiniteScroll;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage extends TestBase {
    public WebDriver driver;
    public InfiniteScrollLocators infiniteScrollLocators;

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
        this.infiniteScrollLocators = new InfiniteScrollLocators(driver);
    }
}
