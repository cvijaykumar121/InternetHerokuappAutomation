package com.orangehrm.web.pages.FileUpload;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FileUploadLocators {
    public FileUploadLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
