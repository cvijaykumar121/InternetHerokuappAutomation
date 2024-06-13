package com.orangehrm.web.pages.FileDownload;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class FileDownloadPage extends TestBase {
    public WebDriver driver;
    public FileDownloadLocators fileDownloadLocators;

    public FileDownloadPage(WebDriver driver) {
        this.driver = driver;
        this.fileDownloadLocators = new FileDownloadLocators(driver);
    }
}
