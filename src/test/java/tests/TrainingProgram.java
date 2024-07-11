package tests;

import actions.Login;
import actions.Register;
import org.testng.Assert;
import org.testng.annotations.Test;
import actions.Dashboard;
import actions.Training;
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

        ConfigLoader configLoader = new ConfigLoader("src/test/resources/properties/userData.properties");

        login();

        dashboard.clickTrainingButton();

        training.clickGenerateProgramButton();

        training.dragAndDropTrainingProgram(configLoader.getProperty("weekDay"), configLoader.getProperty("trainingProgram"));


    }

    private void login() {

        ConfigLoader configLoader = new ConfigLoader("src/test/resources/properties/userData.properties");

        String email = configLoader.getProperty("email");
        String password = configLoader.getProperty("password");

        loginActions(email, password);


        dashboard.clickTrainingButton();

        training.clickGenerateProgramButton();

        if(login.errorForbiddenAccessText().equals("Access forbidden!")){
            login.clickRegisterButton();
            register.registerUser(true);
            loginActions(email, password);
        }

        Assert.assertTrue(dashboard.getUserEmailFromDashBoard().equalsIgnoreCase(email));

    }

    private void loginActions(String email, String password) {
        login.enterUserName(email);
        login.enterPassword(password);
        login.clickSubmit();
    }
}
