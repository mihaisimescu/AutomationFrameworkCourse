package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import webelements.DashboardElements;

import java.time.Duration;

public class Dashboard {

    private DashboardElements elements = null;
    private Wait<WebDriver> wait;

    public Dashboard(WebDriver driver){
        elements = new DashboardElements(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getUserEmailFromDashBoard(){
        wait.until(d -> elements.userNameDisplay().isDisplayed());
        return  elements.userNameDisplay().getText();
    }

    public void clickTrainingButton(){
        wait.until(d->elements.userNameDisplay().isDisplayed());
        elements.trainingButton().click();
    }

}
