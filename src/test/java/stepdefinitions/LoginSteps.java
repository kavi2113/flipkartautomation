package stepdefinitions;


import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver=null;
    LoginPage login;
    HomePage home;
    @Given("user is on login page")
    public void user_is_on_login_page() throws InterruptedException {
    System.out.println("=== I am Inside the Step- user is on login page===");
    driver=new ChromeDriver();

    driver.manage().window().maximize();
    driver.navigate().to("https://www.saucedemo.com/v1/");
        Thread.sleep(2000);

    }
    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) {
    System.out.println("Inside Step- user enters username and password");
    login=new LoginPage(driver);
    login.enterUserName(username);
    login.enterpassword(password);
    }
    @And("clicks on login button")
    public void clicks_on_login_button() {
    System.out.println("Inside Step- clicks on login button");
    login.clickLogin();
    //driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
    }
    @Then("user is navigated to the Home page")
    public void user_is_navigated_to_the_home_page() {
        home=new HomePage(driver);
    System.out.println("Inside Step- user is navigated to the Home page");
    home.isProductDisplayed();
     driver.quit();
    }
}
