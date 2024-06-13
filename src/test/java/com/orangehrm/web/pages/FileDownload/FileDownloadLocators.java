package com.orangehrm.web.pages.FileDownload;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FileDownloadLocators {
    public FileDownloadLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
