package tests;

import Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;


public class FirstTest extends BaseTest {
    private HomePage homePage;
    private ProductsPage productsPage;
    private SelectedProductPage selectedProductPage;
    private ShoppingCartPage shoppingCartPage;

    @BeforeMethod
    public void beforeMethod() {
        homePage = new HomePage(driver.webDriver);
        productsPage = new ProductsPage(driver.webDriver);
        selectedProductPage = new SelectedProductPage(driver.webDriver);
        shoppingCartPage = new ShoppingCartPage(driver.webDriver);
    }

    @Test
    public void addToCartFirstDress() {
        homePage.clickOnSearchbox();
        homePage.typeKeyword();
        homePage.clickOnSearchButton();
        productsPage.clickOnFirstProduct();
        selectedProductPage.scrollDown();
        selectedProductPage.clickOnAddToCartButton();
        selectedProductPage.isProductAddedToCart();
    }

    @Test
    public void addToCartSecondDress() {
        homePage.clickOnSearchbox();
        homePage.typeKeyword();
        homePage.clickOnSearchButton();
        productsPage.clickOnSecondProduct();
        selectedProductPage.clickOnSizeDropdown();
        selectedProductPage.clickOnColorButton();
        selectedProductPage.scrollDown();
        selectedProductPage.clickOnAddToCartButton();
        selectedProductPage.isProductAddedToCart();
    }

    @Test
    public void addDressToCartAndDeleteFromCart() {
        homePage.clickOnSearchbox();
        homePage.typeKeyword();
        homePage.clickOnSearchButton();
        productsPage.clickOnThirdProduct();
        selectedProductPage.clickOnQuantityAddButton();
        selectedProductPage.clickOnSizeDropdown();
        selectedProductPage.clickOnColorButton2();
        selectedProductPage.scrollDown();
        selectedProductPage.clickOnAddToCartButton();
        selectedProductPage.isProductAddedToCart();
        selectedProductPage.clickOnProceedToCheckOutButton();
        shoppingCartPage.clickOnDeleteButton();
        shoppingCartPage.cartIsEmpty();
    }

    @AfterMethod
    public void teardown() {
        driver.exit();
    }
}
