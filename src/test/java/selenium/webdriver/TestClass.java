package selenium.webdriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestClass {

    private static final String URL = "http://gorod.gov.spb.ru";

    private WebDriver driver;
    private AssertJUnit Assert;

    @BeforeSuite
    public void suiteSetUps() {
        ChromeDriverManager.getInstance().setup();
    }

    @BeforeMethod
    public void initDriver() {
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(URL);
    }


    @Test
    void openPageTest() {

        Assert.assertTrue(driver.getTitle().contains("Портал"));

    }




    @AfterMethod
    public void tearDown() {
        driver.quit();
    }




}
