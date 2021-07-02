package tests;

import Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;


public class FirstTest {
    public static Driver driver = null;

    @Test
    public void method1_searchDressClickOnFirstItemAddToCart() {
        driver = Driver.getInstance();
        driver.navigate();
        driver.webDriver.findElement(By.cssSelector("#search_query_top")).sendKeys("dress");
        //click on search button
        driver.webDriver.findElementByXPath("//*[@id=\"searchbox\"]/button").click();
        //clik on first item
        WebDriverWait wait = new WebDriverWait(driver.webDriver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")));
        driver.webDriver.findElementByXPath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img").click();
        //click on Add to Cart
        driver.webDriver.findElementByXPath("//*[@id=\"add_to_cart\"]/button/span").click();
        //wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span/i")));
        //Click on Continue Shopping
        WebElement continueShoppingButton = driver.webDriver.findElementByXPath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span/i");
        continueShoppingButton.click();
        //exit
        driver.exit();
    }

    @Test
    public void method2_searchDressClickOnSecondItemChangeSizeAndColorAddToCart() {
        driver = Driver.getInstance();
        driver.navigate();
        driver.webDriver.findElement(By.cssSelector("#search_query_top")).sendKeys("dress");
        //click on search button
        driver.webDriver.findElementByXPath("//*[@id=\"searchbox\"]/button").click();
        //clik on the second Item
        WebDriverWait wait = new WebDriverWait(driver.webDriver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")));
        driver.webDriver.findElementByXPath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img").click();
        //clik on Size dropdown and select Size
        driver.webDriver.findElementByXPath("//*[@id=\"group_1\"]/option[2]").click();
        //clik on Color button
        driver.webDriver.findElementByXPath("//*[@id=\"color_24\"]").click();
        //click on Add to Cart
        driver.webDriver.findElementByXPath("//*[@id=\"add_to_cart\"]/button/span").click();
        //wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span/i")));
        //Click on Continue Shopping
        WebElement continueShoppingButton = driver.webDriver.findElementByXPath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span/i");
        continueShoppingButton.click();
        //exit
        driver.exit();
    }

    @Test
    public void method3_searchDressClickAnyItemChangeSizeQuantityColorAddToCartProceedDelete() {
        driver = Driver.getInstance();
        driver.navigate();
        driver.webDriver.findElement(By.cssSelector("#search_query_top")).sendKeys("dress");
        //click on search button
        driver.webDriver.findElementByXPath("//*[@id=\"searchbox\"]/button").click();
        //clik an Item
        WebDriverWait wait = new WebDriverWait(driver.webDriver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img")));
        driver.webDriver.findElementByXPath("//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img").click();
        //click on Quantity + button
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"bigpic\"]")));
        driver.webDriver.findElementByXPath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i").click();
        //clik on Size dropdown and select Size
        driver.webDriver.findElementByXPath("//*[@id=\"group_1\"]/option[2]").click();
        //clik on Color button
        driver.webDriver.findElementByXPath("//*[@id=\"color_8\"]").click();
        //click on Add to Cart
        driver.webDriver.findElementByXPath("//*[@id=\"add_to_cart\"]/button/span").click();
        //wait and click 'Proceed to checkout'
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Proceed to checkout']")));
        //Click on Continue Shopping
        driver.webDriver.findElementByXPath("//a[@title='Proceed to checkout']").click();
        //Delete the product from cart
        driver.webDriver.findElement(By.cssSelector("[class='icon-trash']")).click();
        //exit
        driver.exit();
    }

}
