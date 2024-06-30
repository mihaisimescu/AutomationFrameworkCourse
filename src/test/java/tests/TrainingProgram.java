package tests;

import actions.Login;
import actions.Register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Dashboard;
import utils.BaseTest;

import java.time.Duration;

public class TrainingProgram extends BaseTest {

    private Login login = null;
    private Dashboard dashboard = null;
    private Register register = null;
    private RegisterUser registerUser = null;

    @Test
    public void openTrainingTab(){

        initTest("Training program");

        login  = new Login(driver);
        dashboard = new Dashboard(driver);
        register = new Register(driver);
        registerUser = new RegisterUser();

        login();


    }

    private void login() {
        login.enterUserName("mihai@ww.com");
        login.enterPassword("11111");
        login.clickSubmit();

        if(login.errorForbiddenAccessText().equals("Access forbidden!")){
            login.clickRegisterButton();
            register.registerUser(true);
        }

    }
}
