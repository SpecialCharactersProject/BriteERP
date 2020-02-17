package test.search_test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.login_page.LoginPage;
import pages.search_page.SearchPage;
import test.base_test.BaseTest;
import utilities.BrightERPUtil;
import utilities.Driver;

public class SearchTestKarina extends BaseTest {

    LoginPage log = new LoginPage();
    SearchPage searchPage = new SearchPage();

//    @Test
//    public void loggingIn () {
//        log.login();
//    }

    @Test (groups = {"smokeTest"},priority = 12)
    public void searchMultipleParameters () {
        log.contactsButton.click();
        BrightERPUtil.pause(2);

        log.searchButton.click();
        BrightERPUtil.pause(2);
        log.searchButton.sendKeys("Asan" + Keys.ENTER);
        log.searchButton.sendKeys("General Manager" + Keys.ENTER);
        Assert.assertTrue(searchPage.afterEnteringInSearchBox.isDisplayed(), "Search Multiple Parameters Test is failed.");
    }

    @Test (groups = {"smokeTest"},priority = 11)
    public void styleOfContacts () {
        log.contactsButton.click();
        BrightERPUtil.pause(3);

        searchPage.listButton.click();
        BrightERPUtil.pause(3);
        Assert.assertTrue(searchPage.listTable.isDisplayed(), "The table is not displayed.");
        searchPage.kanbanButton.click();
        BrightERPUtil.pause(3);
        Assert.assertTrue(searchPage.kanbanTable.isDisplayed(), "Kanban table is not displayed.");
    }

    @Test (groups = {"smokeTest"},priority = 10)
    public void numberOfContacts () {
        log.contactsButton.click();
        BrightERPUtil.pause(3);
        searchPage.numOfElementsDisplayed.click();
        Assert.assertTrue(searchPage.numOfElementsDisplayed.isDisplayed(), "The number of Contacts in not displayed.");
    }


}
