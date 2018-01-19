package selenium.webdriver.oursp.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class header {


    private WebElement messageButton;
    private WebElement sityPrograms;


    private WebDriver driver;

    public header(WebDriver driver) {
        this.driver = driver;
        messageButton = driver.findElement(By.xpath("//*[contains(text(),'Сообщения')]"));
        messageButton = driver.findElement(By.xpath("//*[contains(text(),'Городские программы')]"));
    }

    public void messageButtonClick() {
        messageButton.click();
    }


}
