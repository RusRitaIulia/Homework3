package pages;

import java.lang.String;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class ShoppingCartPage extends BasePage {

    private static final By deleteButton = By.className("cart_quantity_delete");
    private static final By notificationMessage = By.cssSelector(".alert.alert-warning");

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnDeleteButton() {
        waitUntilElementIsClickable(deleteButton);
        driver.findElement(deleteButton).click();
    }

    public void waitUntilElementIsClickable(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public ShoppingCartPage cartIsEmpty() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(notificationMessage));
        Assert.assertEquals(driver.findElement(notificationMessage).getText(), "Your shopping cart is empty.");
        return this;
    }
}
