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

        driver.get("http://apptest.go.ro:9999/login");
        login = new Login(driver);
        register = new Register(driver);

        login.clickRegisterButton();

        register.setFirstname("Mihai");
        register.setLastname("Sim");
        register.setPhoneNumber("00002");
        register.setEmail("mihai@e.com");
        register.setPassword("11111");
        register.setCity("Brasov");
        register.setTrainer();
        register.submit();

        Assert.assertEquals(register.getSignUpText(), "Sign Up");
    }
}
