package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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

    public List<WebElement> calendarDays(){
        return driver.findElements(By.cssSelector(".fc-daygrid-day"));
    }

    public WebElement eventTitle(){
        return driver.findElement(By.cssSelector("#eventTitle"));
    }

    public WebElement createEventButton(){
        return driver.findElement(By.cssSelector("#createEventButton"));
    }

    public List<WebElement> events(){
        return driver.findElements(By.cssSelector(".fc-event"));
    }
}
