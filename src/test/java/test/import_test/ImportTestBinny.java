package test.import_test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.base_page.BasePage;
import pages.import_page.ImportPage;
import pages.login_page.LoginPage;
import test.base_test.BaseTest;
import utilities.BrightERPUtil;

public class ImportTestBinny extends BaseTest {

    ImportPage importPage = new ImportPage();
    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();

//    @BeforeClass
//
//    public void login() {
//        loginPage.login();
//    }

    @Test(groups = {"smokeTest"},priority = 16)
    public void validation_of_the_cancel_button() throws InterruptedException {
        basePage.contactsButton.click();
        BrightERPUtil.pause(5);
        importPage.importBtn.click();
        Assert.assertTrue(importPage.cancelButton.isDisplayed(), "Cancel button is NOT displayed!");
        importPage.cancelButton.click();

    }

    @Test(groups = {"smokeTest"},priority = 17)
    public void validation_of_the_help_button() {
        basePage.contactsButton.click();
        BrightERPUtil.pause(5);
        importPage.importBtn.click();

        Assert.assertTrue(importPage.helpButton.isDisplayed(), "Help button is NOT displayed!");

        importPage.helpButton.click();
        String expectedURL = "https://www.odoo.com/documentation/user/11.0/general/base_import/import_faq.html";

        String acturalURL = importPage.helpButton.getAttribute("href");
        Assert.assertTrue(acturalURL.equals(expectedURL), "Help button clicking verification FAILED!");
    }


}
