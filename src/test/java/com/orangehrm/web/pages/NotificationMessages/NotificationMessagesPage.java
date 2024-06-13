package com.orangehrm.web.pages.NotificationMessages;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class NotificationMessagesPage extends TestBase {
    public WebDriver driver;
    public NotificationMessagesLocators notificationMessagesLocators;

    public NotificationMessagesPage(WebDriver driver) {
        this.driver = driver;
        this.notificationMessagesLocators = new NotificationMessagesLocators(driver);
    }
}
