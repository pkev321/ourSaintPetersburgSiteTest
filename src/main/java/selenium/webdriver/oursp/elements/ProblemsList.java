package selenium.webdriver.oursp.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProblemsList {

    private WebDriver driver;

    private List<WebElement> problems;


    public ProblemsList(WebDriver driver) {
        this.driver = driver;
        problems = driver.findElements(By.xpath("//a[@class='block-messages']"));
    }

    public int getCount() {
        return problems.size();
    }
}
