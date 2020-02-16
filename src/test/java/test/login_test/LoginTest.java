package test.login_test;

import org.testng.annotations.Test;
import pages.login_page.LoginPage;
import test.base_test.BaseTest;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    @Test
    public void login(){
        loginPage.login();
    }
}
