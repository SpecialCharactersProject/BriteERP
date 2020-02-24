package test.import_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.base_page.BasePage;
import pages.import_page.ImportPage;
import pages.login_page.LoginPage;
import test.base_test.BaseTest;
import utilities.BrightERPUtil;
import utilities.Driver;

import java.util.Set;

public class ImportTestBinny extends BaseTest {

    ImportPage importPage = new ImportPage();
    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();

    @BeforeClass

    public void login() {
        loginPage.login();
    }

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
        BrightERPUtil.pause(5);
        basePage.contactsButton.click();
        BrightERPUtil.pause(5);
        importPage.importBtn.click();

        Assert.assertTrue(importPage.helpButton.isDisplayed(), "Help button is NOT displayed!");
        String mainHandle = Driver.getDriver().getWindowHandle();

        WebElement clickHereLink = Driver.getDriver().findElement(By.linkText("Help"));
        BrightERPUtil.pause(3);
        importPage.helpButton.click();
        String expectedURL = "https://www.odoo.com/documentation/user/11.0/general/base_import/import_faq.html";

        String acturalURL = importPage.helpButton.getAttribute("href");
        Assert.assertTrue(acturalURL.equals(expectedURL), "Help button clicking verification FAILED!");
        BrightERPUtil.pause(5);

        for(String handle : Driver.getDriver().getWindowHandles()){
            if(!handle.equals(mainHandle)){
               Driver.getDriver().switchTo().window(mainHandle);
            }
        }



        BrightERPUtil.pause(5);



    }


}
