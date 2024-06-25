package pages;

import org.openqa.selenium.WebDriver;
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
