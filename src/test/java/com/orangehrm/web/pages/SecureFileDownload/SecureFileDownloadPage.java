package com.orangehrm.web.pages.SecureFileDownload;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class SecureFileDownloadPage extends TestBase {
    public WebDriver driver;
    public SecureFileDownloadLocators secureFileDownloadLocators;

    public SecureFileDownloadPage(WebDriver driver) {
        this.driver = driver;
        this.secureFileDownloadLocators = new SecureFileDownloadLocators(driver);
    }
}
