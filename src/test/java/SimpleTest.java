import actions.SimpleActions;
import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;
import utils.ReportManager;

public class SimpleTest extends BaseTest {

    @Test
    public void firstTest(){

        initTest("SampleTest");
        driver.get("http://apptest.go.ro:9999/login");

        String expectedText = "Login";
        SimpleActions simpleActions = new SimpleActions(driver);
        String loginText = simpleActions.getLoginText();

        Assert.assertEquals(loginText.toLowerCase(), expectedText);
        //Assert.assertTrue(loginText.contains(expectedText));



    }
}
