package tests;

import actions.Login;
import actions.Register;
import org.testng.annotations.Test;
import pages.Dashboard;
import pages.Training;
import utils.BaseTest;
import utils.ConfigLoader;

public class TrainingProgram extends BaseTest {

    private Login login = null;
    private Dashboard dashboard = null;
    private Register register = null;
    private RegisterUser registerUser = null;
    private Training training;

    @Test
    public void openTrainingTab(){

        initTest("Training program");

        login  = new Login(driver);
        dashboard = new Dashboard(driver);
        register = new Register(driver);
        registerUser = new RegisterUser();
        training = new Training(driver);

        login();


    }

    private void login() {

        ConfigLoader configLoader = new ConfigLoader("src/test/resources/properties/userData.properties");

        String email = configLoader.getProperty("email");
        String password = configLoader.getProperty("password");

        login.enterUserName(email);
        login.enterPassword(password);
        login.clickSubmit();

        dashboard.clickTrainingButton();

        training.clickGenerateProgramButton();

//        if(login.errorForbiddenAccessText().equals("Access forbidden!")){
//            login.clickRegisterButton();
//            register.registerUser(true);
//        }

    }
}
