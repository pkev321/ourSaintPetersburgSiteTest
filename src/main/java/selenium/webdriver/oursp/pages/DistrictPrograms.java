package selenium.webdriver.oursp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.webdriver.oursp.elements.FilterPrograms;
import selenium.webdriver.oursp.elements.Header;
import selenium.webdriver.oursp.elements.ProblemsList;

public class DistrictPrograms {

    private WebDriver driver;
    private Header header;
    private FilterPrograms filterPrograms;

    private WebElement buttonProgramDistrict;
    private WebElement buttonProgramCity;
    private WebElement buttonProgramProject;
    private WebElement buttonProgramCurrent;


    public DistrictPrograms(WebDriver driver) {
        this.driver = driver;
        header = new Header(driver);
        filterPrograms = new FilterPrograms(driver);
        buttonProgramDistrict = driver.findElement(By.xpath("//*[contains(text(),'Районные')]"));
        buttonProgramCity = driver.findElement(By.xpath("//*[contains(text(),'Общегородские')]"));
        buttonProgramProject = driver.findElement(By.xpath("//*[contains(text(),'Проекты программ')]"));
        buttonProgramCurrent = driver.findElement(By.xpath("//*[contains(text(),'Текущий ремонт')]"));
    }

    public FilterPrograms getFilterPrograms() {
        return filterPrograms;
    }


}
