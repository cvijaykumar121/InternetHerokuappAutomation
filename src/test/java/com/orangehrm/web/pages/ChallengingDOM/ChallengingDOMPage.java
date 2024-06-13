package com.orangehrm.web.pages.ChallengingDOM;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class ChallengingDOMPage extends TestBase {
    public WebDriver driver;
    public ChallengingDOMLocators challengingDOMLocators;

    public ChallengingDOMPage(WebDriver driver) {
        this.driver = driver;
        this.challengingDOMLocators = new ChallengingDOMLocators(driver);
    }
}
