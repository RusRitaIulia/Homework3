package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
    public static WebDriver driver = null;
    public WebDriverWait webDriverWait;

    public BasePage(WebDriver driver) {
        BasePage.driver = (WebDriver) driver;
        webDriverWait = new WebDriverWait(driver, 15);
        // driver.get("http://automationpractice.com/index.php");
        //  driver.manage().window().maximize();
    }
}