package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private static final By searchBoxselector = By.id("search_query_top");
    private static final By searchButtonselector = By.name("submit_search");
    public static final String KEYWORD = "dress";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSearchbox() {
        driver.findElement(searchBoxselector).click();
    }

    public void typeKeyword() {
        driver.findElement(searchBoxselector).sendKeys(KEYWORD);
    }

    public void clickOnSearchButton() {
        driver.findElement(searchButtonselector).click();
    }
}
