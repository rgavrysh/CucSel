package annotation;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class OutlineExampleStepDefinition {

    @Before("@LoginForm")
    public void beforeScenario() {
        System.out.println("\n----- Before scenario execution -----");
    }

    @After("@LoginForm")
    public void afterScenario() {
        System.out.println("\n----- After scenario execution -----");
    }

    @Given("^User navigates to some login Page$")
    public void navigateToLoginPage() {
        System.out.println("\n ***** \tUser navigates to Login page");
    }

    @When("^User enters username as \"([^\"]*)\"$")
    public void enterUsername(String username) {
        System.out.println("\n ***** \tEnter username: \t" + username);
    }

    @When("^User enters password as \"(.*)\"$")
    public void enterPassword(String password) {
        System.out.println("\n ***** \tEnter password: \t" + password);
    }

    @When("^User enters invalid data on page$")
    public void enterDataToForm(DataTable dataTable) {
        List<List<String>> data = dataTable.raw();
        System.out.println("\n ********** \tFirst Name: \t" + data.get(1).get(1));
        System.out.println("\n ********** \tLast Name: \t" + data.get(2).get(1));
        System.out.println("\n ********** \tEmail Address: \t" + data.get(3).get(1));
        System.out.println("\n ********** \tPassword: \t" + data.get(5).get(1));
        System.out.println("\n ********** \tBirthDay: \t" + data.get(6).get(1));
    }

    @Then("^Login should be successful$")
    public void loginSuccess(){
        System.out.println("\n ***** \tLogin success");
        Assert.assertEquals("Login success", "Login success");
    }

    @Then("^Login should be failed$")
    public void loginFailed() {
        System.out.println("\n ***** \tLogin fails");
        Assert.assertFalse("Login success" == "Login fails");
    }
}
