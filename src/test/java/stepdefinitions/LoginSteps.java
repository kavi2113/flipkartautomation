package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver=null;

    @Given("user is on login page")
    public void user_is_on_login_page() {
    System.out.println("Inside Step- user is on login page");
    driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

    driver.manage().window().maximize();
    }
    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) {
    System.out.println("Inside Step- user enters username and password");
    driver.navigate().to("https://www.saucedemo.com/v1/");
    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
    }
    @And("clicks on login button")
    public void clicks_on_login_button() {
    System.out.println("Inside Step- clicks on login button");
    driver.findElement(By.xpath("//input[@value='LOGIN']")).sendKeys(Keys.ENTER);
    }
    @Then("user is navigated to the Home page")
    public void user_is_navigated_to_the_home_page() {
    System.out.println("Inside Step- user is navigated to the Home page");
     driver.getPageSource().contains("Products");
     driver.quit();
    }
}
