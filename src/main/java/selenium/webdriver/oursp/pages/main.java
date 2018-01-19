package selenium.webdriver.oursp.pages;

import org.openqa.selenium.WebDriver;
import selenium.webdriver.oursp.elements.header;

public class main {
    private WebDriver driver;
    private header header;


    public main(WebDriver driver) {
        this.driver = driver;
        header = new header(driver);
    }


}
