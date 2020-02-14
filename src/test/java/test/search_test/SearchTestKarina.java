package test.search_test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.login_page.LoginPage;
import test.base_test.BaseTest;

public class SearchTestKarina extends BaseTest {

    LoginPage log = new LoginPage();

    @Test
    public void loggingIn () throws InterruptedException{
        log.login();
    }

    @Test
    public void searchMultipleParameters () throws InterruptedException {
        log.searchButton.click();
        log.searchButton.sendKeys("Asan" + Keys.ENTER);
        Thread.sleep(2000);
        log.searchButton.sendKeys("General Manager" + Keys.ENTER);

    }


}
