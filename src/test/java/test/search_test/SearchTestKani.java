package test.search_test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.login_page.LoginPage;
import test.base_test.BaseTest;

public class SearchTestKani extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @BeforeClass
    public void login(){
        loginPage.login();

    }

    @Test
    public  void click_contacts(){
        loginPage.contactsButton.click();
    }



}
