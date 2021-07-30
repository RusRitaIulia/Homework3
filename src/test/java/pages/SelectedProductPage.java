package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SelectedProductPage extends BasePage {
    private static final By addToCartSelector = By.id("add_to_cart");
    private static final By productSuccessfullyAdded = By.xpath("//div[contains(@class,'layer_cart_product')]//h2");
    private static final By sizeDropdownSizeM = By.xpath("//*[@id=\"group_1\"]/option[2]");
    private static final By quantityButton = By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i");
    private static final By proceedToCheckoutButton = By.cssSelector("a[title=\"Proceed to checkout\"]");
    private static final String colorButton = "//a[contains(@id,'color_')][@title='%s']";

    public SelectedProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnAddToCartButton() {
        waitUntilElementIsVisible(addToCartSelector);
        driver.findElement(addToCartSelector).click();
    }

    public void clickOnSizeDropdown() {
        waitUntilElementIsClickable(sizeDropdownSizeM);
        driver.findElement(sizeDropdownSizeM).click();
    }


    public void clickOnColorButton(String colorToPick) {
        driver.findElement(By.xpath(String.format((colorButton), colorToPick))).click();
    }


    public void clickOnQuantityAddButton() {
        waitUntilElementIsClickable(quantityButton);
        driver.findElement(quantityButton).click();
    }

    public void clickOnProceedToCheckOutButton() {
        waitUntilElementIsClickable(proceedToCheckoutButton);
        driver.findElement(proceedToCheckoutButton).click();
    }

    public void waitUntilElementIsClickable(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilElementIsVisible(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void isProductAddedToCart() {
        waitUntilElementIsVisible(productSuccessfullyAdded);
        Assert.assertEquals(driver.findElement(productSuccessfullyAdded).getText(), "Product successfully added to your shopping cart");
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
    }

}
