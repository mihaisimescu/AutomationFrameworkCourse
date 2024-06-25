package actions;

import webelements.LoginElements;
import org.openqa.selenium.WebDriver;

public class Login {

    private LoginElements element;

    public Login(WebDriver driver){
        this.element = new LoginElements(driver);
    }

    public void clickRegisterButton(){
        element.registerButton().click();
    }

    public void setEmail(String email){
        element.userEmail().sendKeys(email);
    }

    public void setPassword(String password){
        element.userPassword().sendKeys(password);
    }

    public void submit(){
        element.submitButton().click();
    }
}
