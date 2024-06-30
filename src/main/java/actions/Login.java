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

    public void enterUserName(String email){
        element.userEmail().sendKeys(email);
    }

    public void enterPassword(String password){
        element.userPassword().sendKeys(password);
    }

    public void clickSubmit(){
        element.submitButton().click();
    }
}
