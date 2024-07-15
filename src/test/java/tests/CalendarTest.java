package tests;

import actions.Dashboard;
import actions.Login;
import actions.Register;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;
import utils.ConfigLoader;

public class CalendarTest extends BaseTest {

    private Login login = null;
    private Dashboard dashboard = null;

    private Register register;
    private String email = "";
    private String parola ="";

    @Test
    public void openDashboard(){

        initTest("Training program");

        login  = new Login(driver);
        dashboard = new Dashboard(driver);
        register = new Register(driver);


        ConfigLoader configLoader = new ConfigLoader("src/test/resources/properties/userData.properties");
        ConfigLoader configLoaderDate = new ConfigLoader("src/test/resources/properties/dateData.properties");

        login();

        dashboard.clickSpecificDay(configLoaderDate.getProperty("date"));

        dashboard.sendEventText(configLoaderDate.getProperty("eventText"));
        dashboard.clickCreateEventButton();

        Assert.assertTrue(dashboard.isEventPresent(configLoaderDate.getProperty("eventText")));

    }

    private void login() {

        ConfigLoader configLoader = new ConfigLoader("src/test/resources/properties/userData.properties");

        String email = configLoader.getProperty("email");
        String password = configLoader.getProperty("password");

        loginActions(email, password);

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
