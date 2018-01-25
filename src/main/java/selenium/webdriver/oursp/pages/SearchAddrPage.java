package selenium.webdriver.oursp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.webdriver.oursp.elements.Header;

public class SearchAddrPage {
    private WebDriver driver;
    private Header header;

    private WebElement searchString;
    private WebElement searchButton;


    public SearchAddrPage(WebDriver driver) {
        this.driver = driver;
        header = new Header(driver);

        searchString = driver.findElement(By.xpath("//*[contains(@class, 'form-control')]"));
        searchButton = driver.findElement(By.xpath("//*[contains(@class, 'input-group-btn')]"));
    }

    public void SearchAddr(String addr) {
        searchString.sendKeys(addr);
        searchButton.click();
    }


}
