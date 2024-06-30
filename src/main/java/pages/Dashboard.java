package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webelements.DashboardElements;
import webelements.RegisterElements;

public class Dashboard {

    private DashboardElements elements = null;

    public Dashboard(WebDriver driver){
        elements = new DashboardElements(driver);
    }

    public String getUsernameText(){
        return elements.getUserName().getText();
    }

}
