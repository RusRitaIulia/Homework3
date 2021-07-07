package tests;
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
        productsPage=new ProductsPage(driver.webDriver);
        selectedProductPage= new SelectedProductPage(driver.webDriver);
        shoppingCartPage=new ShoppingCartPage(driver.webDriver);
    }

    @Test
    public void addToCartFirstDress() {
        homePage.clickOnSearchbox();
        homePage.typeKeyword();
        homePage.clickOnSearchButton();
        productsPage.clickOnFirstProduct();
        selectedProductPage.clickOnAddToCartButton();
    }

    @Test
    public void addToCartSecondDress() {
        homePage.clickOnSearchbox();
        homePage.typeKeyword();
        homePage.clickOnSearchButton();
        productsPage.clickOnSecondProduct();
        selectedProductPage.clickOnSizeDropdown();
        selectedProductPage.clickOnColorButton();
        selectedProductPage.clickOnAddToCartButton();
    }

    @Test
    public void addDressToCartAndDeleteFromCart() {
        homePage.clickOnSearchbox();
        homePage.typeKeyword();
        homePage.clickOnSearchButton();
        productsPage.clickOnAnyProduct();
        selectedProductPage.clickOnQuantityAddButton();
        selectedProductPage.clickOnSizeDropdown();
        selectedProductPage.clickOnColorButton2();
        selectedProductPage.clickOnAddToCartButton();
        selectedProductPage.clickOnProceedToCheckOutButton();
        shoppingCartPage.clickOnDeleteButton();
    }
}
