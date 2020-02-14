package test.import_test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.import_page.ImportPage;
import pages.login_page.LoginPage;
import test.base_test.BaseTest;

public class ImportTestMikail extends BaseTest {
    LoginPage loginPage = new LoginPage();
    ImportPage importPage = new ImportPage();
    @BeforeClass
    public void login() throws InterruptedException {
        loginPage.login();
    }
    @Test
    public void click_contacts() throws InterruptedException {
        loginPage.contactsModuleTab.click();
    }

    @Test
    public void click_import_button(){
        importPage.importButton.click();
    }
}
