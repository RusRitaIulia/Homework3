package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProductsPage extends BasePage {
    private static final By firstProduct = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img");
    private static final By secondProduct = By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img");
    private static final By anyProduct = By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnFirstProduct() {
        waitUntilElementIsClickable(firstProduct);
        driver.findElement(firstProduct).click();
    }

    public void clickOnSecondProduct() {
        waitUntilElementIsClickable(secondProduct);
        driver.findElement(secondProduct).click();
    }

    public void clickOnAnyProduct() {
        waitUntilElementIsClickable(anyProduct);
        driver.findElement(anyProduct).click();
    }

    public void waitUntilElementIsClickable(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
