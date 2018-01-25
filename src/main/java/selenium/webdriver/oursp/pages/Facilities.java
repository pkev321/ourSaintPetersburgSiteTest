package selenium.webdriver.oursp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.webdriver.oursp.elements.Header;
import selenium.webdriver.oursp.elements.ProblemsList;

public class Facilities {
    private WebDriver driver;
    private Header header;
    private ProblemsList problems;

    public Facilities(WebDriver driver) {
        this.driver = driver;
        header = new Header(driver);
        problems = new ProblemsList(driver);
        }
        public int getProblemsCount() {
            return problems.getCount();
        }
}
