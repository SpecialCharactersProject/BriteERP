package pages.login_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ConfigurationReader;

import javax.security.auth.login.Configuration;

public class LoginPage {


    @Test
    public void loginBrightERP() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
         Driver.getDriver().findElement(By.id("login")).sendKeys(ConfigurationReader.getProperty("username1"));
       Driver.getDriver().findElement(By.id("password")).sendKeys(ConfigurationReader.getProperty("password1"));
         Driver.getDriver().findElement(By.xpath("//button[.='Log in']")).click();
    }
}
