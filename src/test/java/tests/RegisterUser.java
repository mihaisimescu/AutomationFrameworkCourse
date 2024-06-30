package tests;

import actions.Login;
import actions.Register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class RegisterUser extends BaseTest {

    private Login login = null;
    private Register register = null;

    @Test
    public void registerUser(){

        initTest("RegisterUser");

        login = new Login(driver);
        register = new Register(driver);

        login.clickRegisterButton();

        register.setFirstname("Mihai");
        register.setLastname("Sim");
        register.setPhoneNumber("00003");
        register.setEmail("mihai@t.com");
        register.setPassword("11111");
        register.setCity("Brasov");
        register.setTrainer();
        register.submit();

        Assert.assertEquals(register.getSignUpText(), "Sign Up");
    }
}
