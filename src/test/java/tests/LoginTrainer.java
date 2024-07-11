package tests;

import actions.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import actions.Dashboard;
import utils.BaseTest;
import utils.ConfigLoader;

import java.time.Duration;

public class LoginTrainer extends BaseTest {

    private Login login = null;
    private Dashboard dashboard = null;

    @Test
    public void loginTrainer(){

        initTest("Login Trainer");

        login = new Login(driver);

        ConfigLoader configLoader = new ConfigLoader("src/test/resources/properties/userData.properties");

        String email = configLoader.getProperty("email");
        String password = configLoader.getProperty("password");

        login.enterUserName(email);
        login.enterPassword(password);
        login.clickSubmit();

        dashboard = new Dashboard(driver);

        //Implicit waits not good practice
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='navigation__link userName']")));

        Assert.assertTrue(dashboard.getUsernameText().equalsIgnoreCase("mihai@w.com"));
    }

}
