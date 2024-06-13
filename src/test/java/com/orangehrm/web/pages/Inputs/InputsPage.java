package com.orangehrm.web.pages.Inputs;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class InputsPage extends TestBase {
    public WebDriver driver;
    public InputsLocators inputsLocators;

    public InputsPage(WebDriver driver) {
        this.driver = driver;
        this.inputsLocators = new InputsLocators(driver);
    }
}
