package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By txt_username= By.xpath("//input[@id='user-name']");
    By txt_password=By.xpath("//input[@type='password']");
    By btn_login=By.xpath("//input[@value='LOGIN']");

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void enterUserName(String username)
    {
driver.findElement(txt_username).sendKeys(username);
    }

    public void enterpassword(String password)
    {
        driver.findElement(txt_password).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(btn_login).click();
    }

}
