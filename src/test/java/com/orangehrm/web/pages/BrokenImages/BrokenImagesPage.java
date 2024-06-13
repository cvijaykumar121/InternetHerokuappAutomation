package com.orangehrm.web.pages.BrokenImages;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenImagesPage extends TestBase {
    public WebDriver driver;
    public BrokenImagesLocators brokenImagesLocators;

    public BrokenImagesPage(WebDriver driver) {
        this.driver = driver;
        this.brokenImagesLocators = new BrokenImagesLocators(driver);
    }

//    public void validateSrcAttributeIsPresentAndIsNotEmpty() {
//        // Find all image elements
//        List<WebElement> images = driver.findElements(By.tagName("img"));
//
//        for (WebElement img : images) {
//            // Validate the 'src' attribute is present and not empty
//            if (src == null || src.isEmpty()) {
//                System.out.println("Image with missing or empty src attribute found: " + img.getAttribute("outerHTML"));
//                continue;
//            }
//        }
//    }
//
//    public void validateIfImageURLIsValid() {
//        // Check if the image URL is valid
//        try {
//            HttpURLConnection connection = (HttpURLConnection) (new URL(src)).openConnection();
//            connection.setRequestMethod("GET");
//            connection.connect();
//            int responseCode = connection.getResponseCode();
//            if (responseCode != 200) {
//                System.out.println("Broken image found: " + src + " (HTTP response code: " + responseCode + ")");
//            } else {
//                System.out.println("Image is valid: " + src);
//            }
//        } catch (Exception e) {
//            System.out.println("Exception while validating image: " + src + " (" + e.getMessage() + ")");
//        }
//
//        // Check if the image has non-zero dimensions
//        if (img.getSize().getHeight() == 0 || img.getSize().getWidth() == 0) {
//            System.out.println("Image with zero dimensions found: " + src);
//        }
//    }
//    }
}
