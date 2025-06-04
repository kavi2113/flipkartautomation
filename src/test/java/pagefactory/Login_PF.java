package pagefactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PF {

    @FindBy(xpath = "//input[@id='user-name']")
    WebElement txt_username;

    @FindBy(xpath="//input[@type='password']")
    WebElement txt_password;

    @FindBy(xpath="//input[@value='LOGIN']")
    WebElement btn_login;
    WebDriver driver;
    public Login_PF(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, Login_PF.class);
    }
    public void enterUserName(String username)
    {
    txt_username.sendKeys(username);
    }

    public void enterPassword(String password)
    {
    txt_password.sendKeys(password);
    }

    public void clickOnLogin()
    {
    btn_login.sendKeys(Keys.ENTER);
    }
}
