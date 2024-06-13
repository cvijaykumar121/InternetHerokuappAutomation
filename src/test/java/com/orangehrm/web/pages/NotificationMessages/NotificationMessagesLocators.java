package com.orangehrm.web.pages.NotificationMessages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NotificationMessagesLocators {
    public NotificationMessagesLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
