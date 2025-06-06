package stepdefinitionsforhooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HooksDemoSteps {

    WebDriver driver=null;

    @Before
    public void browserSetup()
    {
    System.out.println("=====I am inside browserSetup=====");
    driver = new ChromeDriver();
    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    }

    @After
    public void tearDown()
    {
    System.out.println("=====I am inside tearDown=====");
     driver.quit();
    }

    @BeforeStep
    public void beforeStep()
    {
        System.out.println("======I am inside beforeStep and will run before each step======");
    }


    @AfterStep
    public void afterStep()
    {
        System.out.println("======I am inside afterStep and will run after each step======");
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {

    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
    }

    @When("user enters invalid username and password")
    public void user_enters_invalid_username_and_password() {
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
    }

    @Then("user is navigated to the Home page")
    public void user_is_navigated_to_the_home_page() {
    }

}
