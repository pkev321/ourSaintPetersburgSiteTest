package selenium.webdriver.oursp.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.webdriver.oursp.pages.DistrictPrograms;
import selenium.webdriver.oursp.pages.SearchAddrPage;

public class Header {


    //@FindBy(xpath = "//dl[@class='sub-cate-items']/dd/a")
    private WebElement messageButton;
    private WebElement sityPrograms;
    private WebElement searchByAddrButton;


    private WebDriver driver;

    public Header(WebDriver driver) {
        this.driver = driver;
        messageButton = driver.findElement(By.xpath("//*[contains(text(),'Сообщения')]"));
        sityPrograms = driver.findElement(By.xpath("//*[contains(text(),'Городские программы')]"));
        searchByAddrButton = driver.findElement(By.xpath("//*[contains(@class, 'btn btn-link btn-lg')]"));
    }

    public void messageButtonClick() {
        messageButton.click();
    }

    public SearchAddrPage gotoSearchByAddrPage() {
        searchByAddrButton.click();
        return new SearchAddrPage(driver);
    }

    public DistrictPrograms gotoDistrictProgramsPage() {
        sityPrograms.click();
        return new DistrictPrograms(driver);
    }


}
