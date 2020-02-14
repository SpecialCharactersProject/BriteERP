package pages.login_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.base_page.BasePage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

public LoginPage(){
    PageFactory.initElements(Driver.getDriver(),this);

}
@FindBy(id = "login")
    public WebElement usernameInputBox;
@FindBy(id = "password")
    public WebElement passwordInputBox;
@FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

public void login(){

    usernameInputBox.sendKeys(ConfigurationReader.getProperty("username2"));
//    Driver.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    passwordInputBox.sendKeys(ConfigurationReader.getProperty("password2"));
    loginButton.click();
}

}
