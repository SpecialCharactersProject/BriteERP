package test.import_test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.base_page.BasePage;
import pages.import_page.ImportPage;
import pages.login_page.LoginPage;
import test.base_test.BaseTest;
import utilities.Driver;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class ImportTestMikail extends BaseTest {
    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();
    ImportPage importPage = new ImportPage();
    public WebDriverWait wait;

    @BeforeClass
    public void login() {
        loginPage.login();

    }

    @Test
    public void validation_of_import_btn() {
        basePage.contactsButton.click();
        Assert.assertTrue(importPage.importBtn.isDisplayed());
        importPage.importBtn.click();

    }

    @Test
    public void importing_contact_file() throws AWTException, InterruptedException {
        basePage.contactsButton.click();
        importPage.importBtn.click();
        Assert.assertTrue(importPage.importLoadFile.isDisplayed());
       // Driver.getDriver().manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);


        importPage.importLoadFile.click();
        uploadFile("/Users/mikaildurur/Desktop/contacs.xlsx");
        Thread.sleep(2000);

//        wait.until(ExpectedConditions.elementToBeClickable(importPage.loadFileBtn));
//        importPage.loadFileBtn.click();
//        uploadFileWithRobot("/Users/mikaildurur/Desktop/contacs.xlsx");

    }

    public void uploadFileWithRobot(String imagePath) {
        StringSelection stringSelection = new StringSelection(imagePath);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        Robot robot = null;

        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        robot.delay(250);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(150);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static void setClipboardData(String string) {
        //StringSelection is a class that can be used for copy and paste operations.
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

    public static void uploadFile(String fileLocation) {
        try {
            //Setting clipboard with file location
            setClipboardData(fileLocation);
            //native key strokes for CTRL, V and ENTER keys
            Robot robot = new Robot();

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception exp) {
            exp.printStackTrace();
        }

    }
}
