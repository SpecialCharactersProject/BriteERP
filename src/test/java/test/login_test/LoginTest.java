package test.login_test;

import org.testng.annotations.Test;
import pages.login_page.LoginPage;

public class LoginTest {
    LoginPage loginPage = new LoginPage();
    @Test
    public void login(){
        loginPage.login();
    }
}
