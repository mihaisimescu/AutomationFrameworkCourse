package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.BaseTest;

public class CalendarSteps extends BaseTest {

    @Before
    public void beforeScenario(){
        setupClass();;
        initTest("Cucumber Calendar Test");
    }

    @After
    public void afterScenario(){
        tearDown();
    }

    @Given("User is logged in with email {string}, password {string}, and phone number {string}")
    public void user_is_logged_in_with_email_password_and_phone_number(String email, String password, String phoneNumber) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User navigates to the specific day {string}")
    public void user_navigates_to_the_specific_day(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User creates a new event {string}")
    public void user_creates_a_new_event(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The event {string} is present in the calendar")
    public void the_event_is_present_in_the_calendar(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
