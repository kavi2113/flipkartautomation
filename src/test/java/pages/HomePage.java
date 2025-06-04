package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    By products=By.xpath("//div[text()='Products']");


    WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void isProductDisplayed()
    {
driver.findElement(products).isDisplayed();
    }

}
