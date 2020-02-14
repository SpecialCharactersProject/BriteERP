package test.search_test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.login_page.LoginPage;
import test.base_test.BaseTest;
import utilities.Driver;

public class SearchTestKarina extends BaseTest {

    LoginPage log = new LoginPage();

    @Test
    public void loggingIn () {
        log.login();
    }

    @Test
    public void searchMultipleParameters () throws InterruptedException {
        log.contactsButton.click();
        Thread.sleep(3000);

        log.searchButton.click();
        log.searchButton.sendKeys("Asan" + Keys.ENTER);
        Thread.sleep(3000);
        log.searchButton.sendKeys("General Manager" + Keys.ENTER);
    }

    @Test
    public void styleOfContacts () throws InterruptedException {
        log.contactsButton.click();
        Thread.sleep(2000);

        Driver.getDriver().findElement(By.xpath("//button[@accesskey='l']")).click();
        Thread.sleep(3000);
        Driver.getDriver().findElement(By.xpath("//button[@accesskey='k']")).click();
    }

    @Test
    public void numberOfContacts () throws InterruptedException{
        log.contactsButton.click();
        Thread.sleep(3000);

        Driver.getDriver().findElement(By.xpath("//span[@class='o_pager_value']")).click();
        Thread.sleep(4000);
        Actions action = new Actions(Driver.getDriver());
        action.doubleClick().perform();




    }


}
