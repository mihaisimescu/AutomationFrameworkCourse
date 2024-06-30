package actions;

import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import webelements.LoginElements;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Login {

    private LoginElements element;
    private Wait<WebDriver> wait;

    public Login(WebDriver driver){
        this.element = new LoginElements(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickRegisterButton(){
        element.registerButton().click();
    }

    public void enterUserName(String email){
        element.userEmail().sendKeys(email);
    }

    public void enterPassword(String password){
        element.userPassword().sendKeys(password);
    }

    public void clickSubmit(){
        element.submitButton().click();
    }

    public String errorForbiddenAccessText(){
         wait.until(d -> element.errorForbiddenAccess().isDisplayed());
         return element.errorForbiddenAccess().getText();

    }
}
