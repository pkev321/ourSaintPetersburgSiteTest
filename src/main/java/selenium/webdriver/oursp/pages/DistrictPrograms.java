package selenium.webdriver.oursp.pages;

import org.openqa.selenium.WebDriver;
import selenium.webdriver.oursp.elements.Header;
import selenium.webdriver.oursp.elements.ProblemsList;

public class DistrictPrograms {

    private WebDriver driver;
    private Header header;


    public DistrictPrograms(WebDriver driver) {
        this.driver = driver;
        header = new Header(driver);

    }

}
