package selenium.webdriver.oursp.elements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.annotation.Nullable;

public class FilterPrograms {

    private WebDriver driver;

    private WebElement yearField;
    private WebElement districtField;
    private WebElement searchButton;

    private WebElement searchField;
    private WebElement searchButton2;

    public FilterPrograms(WebDriver driver) {
        this.driver = driver;
        yearField = driver.findElement(By.xpath("//*[contains(@id,'react-select-2--value-item')]"));
        districtField = driver.findElement(By.xpath("//*[contains(@id,'react-select-3--value-item')]"));
        searchButton = driver.findElement(By.xpath("//*[contains(@class,'btn btn-primary')]"));



        searchField = driver.findElement(By.xpath("//*[contains(@name,'search')]"));
        searchButton2 = driver.findElement(By.xpath("//*[contains(@role,'search-btn')]"));


    }

    public void FindProgram(@Nullable String year, @Nullable String district ) {

        String dasda  = yearField.getText();

        yearField.sendKeys(year);
        districtField.sendKeys(district);
        searchButton.click();
    }

    public void FindProgram(String searchString) {
        searchField.sendKeys(searchString);
        searchButton2.click();
    }


}
