package tests;

import actions.Login;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Dashboard;
import utils.BaseTest;
import webelements.DashboardElements;

import java.time.Duration;

public class LoginUser extends BaseTest {

    private Login login = null;
    private Dashboard dashboard = null;

    @Test
    public void loginUser(){


        initTest("LoginUser");

        driver.get("http://apptest.go.ro:9999/login");
        login = new Login(driver);

        login.setEmail("mihai@w.com");
        login.setPassword("11111");
        login.submit();

        dashboard = new Dashboard(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        String test = dashboard.getUsernameText();

        Assert.assertEquals(test, "mihai@w.com");
    }

}
