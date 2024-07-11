package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardElements {

    private WebDriver driver = null;

    public DashboardElements(WebDriver driver){
        this.driver = driver;
    }

    public WebElement userNameDisplay() {
        return driver.findElement(By.cssSelector("#userNameDisplay"));
    }

    public WebElement trainingButton(){
        return driver.findElement(By.cssSelector(".trainings"));
    }
}
