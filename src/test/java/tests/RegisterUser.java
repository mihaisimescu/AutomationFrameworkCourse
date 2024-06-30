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

        initTest("Register User");

        login = new Login(driver);
        register = new Register(driver);

        login.clickRegisterButton();

        register.registerUser(true);

        Assert.assertEquals(register.getSignUpText(), "Sign Up");
    }
}
