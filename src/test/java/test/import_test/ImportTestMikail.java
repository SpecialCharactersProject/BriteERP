package test.import_test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.base_page.BasePage;
import pages.import_page.ImportPage;
import pages.login_page.LoginPage;
import test.base_test.BaseTest;

public class ImportTestMikail extends BaseTest {
    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();
    ImportPage importPage = new ImportPage();
    @BeforeClass
    public void setUp()  {
        loginPage.login();
        basePage.contactsButton.click();

    }


    @Test
    public void click_import_btn(){
    importPage.importBtn.click();
    }



}
