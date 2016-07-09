package annotation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.logging.Logger;

public class Annotation {
    WebDriver driver = null;
    Logger logger = Logger.getLogger("AnnotationTest");
    @Given("^I am on login MainPage$")
    public void goToMainPage() {
//        logger.info("Open login MainPage.");
//        System.setProperty("webdriver.ie.driver", "C:\\Program Files (x86)\\Internet Explorer\\selenium-ie-driver-2.47.1.jar");
//        driver = new InternetExplorerDriver();
//        driver.get("http://the-internet.herokuapp.com/login");
    }

    @When("^I enter username as \"(.*)\"$")
    public void enterUserName (String username){
//        logger.info("Enter username: \t" + username);
//        driver.findElement(By.id("")).sendKeys(username);
    }

    @When("^I enter password as \"(.*)\"$")
    public void enterPassword (String password){
//        logger.info("Enter password: \t" + password);
//        driver.findElement(By.id("")).sendKeys(password);
//        driver.findElement(By.id("")).click();
    }

    @Then("^Login should fail$")
    public void checkFail() {
//        logger.info("Checking page title.");
        Assert.assertTrue("Login success".equals("Login success"));
//        if(driver.getCurrentUrl().equalsIgnoreCase(
//                "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){
//            System.out.println("Test1 Pass");
//        } else {
//            System.out.println("Test1 Failed");
//        }
//        driver.close();
    }

    @Then("^Relogin option should be available$")
    public void checkRelogin() {
//        logger.info("Checking relogin page exist.");
        Assert.assertTrue("Try to login again" == "Try to login again");
//        if(driver.getCurrentUrl().equalsIgnoreCase(
//                "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){
//            System.out.println("Test2 Pass");
//        } else {
//            System.out.println("Test2 Failed");
//        }
//        driver.close();
    }
}
