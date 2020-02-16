package pages.login_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPageMilos {
    public LoginPageMilos() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement emailInput;
    // password
    @FindBy(id = "password")
    public WebElement passwordInput;
    //login
    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;


    public void goToWebsite() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Test
    public void loginBrightERP() {
        goToWebsite();
        emailInput.sendKeys(ConfigurationReader.getProperty("username1"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("password1"));
        loginButton.click();
    }
}
