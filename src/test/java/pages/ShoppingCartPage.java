package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ShoppingCartPage extends BasePage {

    private static final By deleteButton = By.className("cart_quantity_delete");

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
}
