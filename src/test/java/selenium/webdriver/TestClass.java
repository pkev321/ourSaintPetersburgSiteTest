package selenium.webdriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import selenium.webdriver.oursp.pages.Main;
import selenium.webdriver.oursp.pages.SearchAddrPage;

import java.util.concurrent.TimeUnit;

public class TestClass {

    private static final String URL = "http://gorod.gov.spb.ru";

    private WebDriver driver;
    private AssertJUnit Assert;
    private Main mainPage;

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
        mainPage = new Main(driver);
    }

    @Test
    void openPageTest() {

        Assert.assertTrue(mainPage.getTitle().contains("Портал"));
    }

    @Test
    void searchByAddressTest() {
        SearchAddrPage searchPage = mainPage.moveToSearchAddrPage();
        searchPage.SearchAddr("Восстания 1");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }




}
