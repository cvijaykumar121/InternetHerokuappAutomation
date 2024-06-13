package com.orangehrm.web.pages.JavascriptOnloadEventError;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class JavascriptOnloadPage extends TestBase {
    public WebDriver driver;
    public JavascriptOnloadLocators javascriptOnloadLocators;

    public JavascriptOnloadPage(WebDriver driver) {
        this.driver = driver;
        this.javascriptOnloadLocators = new JavascriptOnloadLocators(driver);
    }
}
