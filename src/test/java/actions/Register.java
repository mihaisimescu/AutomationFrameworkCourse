package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigLoader;
import webelements.RegisterElements;

import java.time.Duration;

public class Register {

    private RegisterElements elements = null;
    private Wait<WebElement> wait;
    private ConfigLoader configLoader;

    public Register(WebDriver driver){
        elements = new RegisterElements(driver);
        //wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getSignUpText(){
        return elements.signUpText().getText();
    }

    public void setFirstname(String firstname){
        elements.firstName().sendKeys(firstname);
    }

    public void setLastname(String lastname){
        elements.lastName().sendKeys(lastname);
    }

    public void setPhoneNumber(String phoneNumber){
        elements.phoneNumber().sendKeys(phoneNumber);
    }

    public void setEmail(String email){
        elements.email().sendKeys(email);
    }

    public void setPassword(String password){
        elements.password().sendKeys(password);
    }

    public void setCity(String City){
        elements.city().sendKeys(City);
    }

    public void setCustomer(){
        elements.customer().click();
    }

    public void setTrainer(){
        elements.trainer().click();
    }

    public void submit(){
        elements.submit().click();
    }

    public void registerUser(boolean isTrainer){

        configLoader = new ConfigLoader("src/test/resources/properties/userData.properties");
        String firstName = configLoader.getProperty("firstName");
        String lastname = configLoader.getProperty("lastname");
        String phoneNumber = configLoader.getProperty("phoneNumber");
        String email = configLoader.getProperty("email");
        String password = configLoader.getProperty("password");
        String city = configLoader.getProperty("city");

        setFirstname(firstName);
        setLastname(lastname);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setPassword(password);
        setCity(city);

        if(isTrainer) {
            setTrainer();
        } else{
            setCustomer();
        }
        submit();
    }
}
