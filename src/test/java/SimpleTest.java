import actions.SimpleActions;
import org.testng.annotations.Test;
import utils.BaseTest;

public class SimpleTest extends BaseTest {

    @Test
    public void firstTest(){

        initTest("SampleTest");
        driver.get("http://apptest.go.ro:9999/login");

        String expectedText = "Login";
        SimpleActions simpleActions = new SimpleActions(driver);
        String loginText = simpleActions.getLoginText();

        //Assert.assertEquals(loginText.toLowerCase(), expectedText);
        //Assert.assertTrue(loginText.contains(expectedText));



    }
}
