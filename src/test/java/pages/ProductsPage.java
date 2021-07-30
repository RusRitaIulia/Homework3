package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProductsPage extends BasePage {
    private static final By firstProduct = By.xpath("//img[contains(@src,'http://automationpractice.com/img/p/1/2/12-home_default.jpg')]");
    private static final By secondProduct = By.xpath("//img[contains(@src,'http://automationpractice.com/img/p/1/0/10-home_default.jpg')]");
    private static final By thirdProduct = By.xpath("//img[contains(@src,'http://automationpractice.com/img/p/1/6/16-home_default.jpg')]");

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

    public void clickOnThirdProduct() {
        waitUntilElementIsClickable(thirdProduct);
        driver.findElement(thirdProduct).click();
    }

    public void waitUntilElementIsClickable(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElement(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

}
