package selenium.webdriver.oursp.pages;

import org.openqa.selenium.WebDriver;
import selenium.webdriver.oursp.elements.Header;

public class Main {
    private WebDriver driver;
    private Header Header;


    public Main(WebDriver driver) {
        this.driver = driver;
        Header = new Header(driver);
    }

    public String getTitle() {
        return driver.getTitle();
    }


}
