package com.orangehrm.web.pages.FileUpload;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends TestBase {
    public WebDriver driver;
    public FileUploadLocators fileUploadLocators;

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
        this.fileUploadLocators = new FileUploadLocators(driver);
    }
}
