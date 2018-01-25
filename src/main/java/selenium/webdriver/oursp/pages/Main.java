package selenium.webdriver.oursp.pages;

import org.openqa.selenium.WebDriver;
import selenium.webdriver.oursp.elements.Header;

public class Main {
    private WebDriver driver;
    private Header header;


    public Main(WebDriver driver) {
        this.driver = driver;
        header = new Header(driver);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public SearchAddrPage moveToSearchAddrPage() {
        return header.gotoSearchByAddrPage();
    }

    public DistrictPrograms moveToDistrictPrograms() {
        return header.gotoDistrictProgramsPage();
    }




}
