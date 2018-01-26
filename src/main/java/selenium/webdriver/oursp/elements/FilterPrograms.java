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

    public FilterPrograms(WebDriver driver) {
        this.driver = driver;
        yearField = driver.findElement(By.xpath("//*[contains(@id,'react-select-2--value-item')]"));
        districtField = driver.findElement(By.xpath("//*[contains(@id,'react-select-3--value-item')]"));
        searchButton = driver.findElement(By.xpath("//*[contains(@class,'btn btn-primary')]"));
    }

    public void FindProgram(@Nullable String year, @Nullable String district ) {

        String dasda  = yearField.sgetText();

        yearField.sendKeys(year);
        districtField.sendKeys(district);
        searchButton.click();
    }


}
