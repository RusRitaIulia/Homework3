package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import Utils.Driver;


public class BaseTest {
    public static Driver driver;

    @BeforeMethod
    public void setup() {
        driver = new Driver();
        driver.navigate();
    }

    @AfterMethod
    public void close() {
        driver.exit();
    }

}