package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

import java.util.logging.Logger;

public class loginStepDef extends BaseClass {
    public WebDriver driver;
    public LoginPage LP;

    @Given("user is on the Home page")
    public void user_is_on_the_Home_page() {
        logger = Logger.getLogger("nopComemrce");
        PropertyConfigurator.configure("log4j.properties");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logger.info("**************************Launching URL**************************");
        LP = new LoginPage(driver);
        driver.get("https://create.rezolve.com/engagement-creation");

        driver.manage().window().maximize();
        if (driver.getPageSource().contains("Login was unsuccessful.")) {
            driver.close();
        } else {
            Assert.assertEquals("Rezolve Create", LP.getPageTitle());
            logger.info("**************************Verifying title**************************");
        }
    }

    @And("click the Login button")
    public void click_the_Login_button() {
        logger.info("**************************Clicking on login button**************************");
        LP.clickLoginButtonInitial();
    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        LP.setUsername("chrisvarghese123@gmail.com");
        LP.setPassword("Rezolve@123");
        LP.clickLoginButton();
        logger.info("**************************Credentials given**************************");
    }

    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        logger.info("****************User is navigated to Home Page after login**************");
        Assert.assertEquals("Rezolve Create", LP.getPageTitle());
    }

    @When("user clicks Trigger option")
    public void user_clicks_Trigger_option() {
        LP.clickCreateTriggerButton();
        logger.info("*********************Create Trigger Page********************");
    }

    @Then("user is displayed the Create An Engagement page")
    public void user_is_displayed_the_Create_An_Engagement_page() {
        logger.info("****************User is navigated to Create Engagement Page**************");
        Assert.assertEquals("Rezolve Create", LP.getPageTitle());
    }

    @And("user clicks Location Button")
    public void userClicksLocationButton() {
        logger.info("****************User is navigated to LocationPage**************");
        LP.clickLocationButton();
        Assert.assertEquals("Rezolve Create", LP.getPageTitle());
    }

    @And("user clicks Image Button")
    public void userClicksImageButton() {
        logger.info("****************User is navigated to ImagePage**************");
        LP.clickImageButton();
        Assert.assertEquals("Rezolve Create", LP.getPageTitle());
    }

    @And("user clicks Audio Button")
    public void userClicksAudioButton() {
        logger.info("****************User is navigated to AudioPage**************");
        LP.clickAudioButton();
        Assert.assertEquals("Rezolve Create", LP.getPageTitle());
    }

    @Then("Close the browser")
    public void close_the_browser() {
        logger.info("**************************Closing Browser**************************");
        driver.quit();

    }

}
