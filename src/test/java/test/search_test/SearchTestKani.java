package test.search_test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.login_page.LoginPage;
import pages.search_page.SearchPage;
import test.base_test.BaseTest;
import utilities.BrightERPUtil;

public class SearchTestKani extends BaseTest {

    LoginPage loginPage = new LoginPage();
    SearchPage searchPage = new SearchPage();

    //1 Login page
    @BeforeClass
    public void login() {
        loginPage.login();

    }


    //2 Click on Contact module
    @Test
    public void click_contacts() {

        loginPage.contactsButton.click();
        BrightERPUtil.pause(3);
    }

    //3 Click on (+) seacrhBox and verify three dropdowns are displayed
    @Test
    public void verify_filterButton()  {
        searchPage.searchButton.click();


       Assert.assertTrue(searchPage.filters.isDisplayed(), "Filter is not displayed");
       Assert.assertTrue(searchPage.groupBy.isDisplayed(), "GroupBy is not displayed!");
       Assert.assertTrue(searchPage.favorites.isDisplayed(), "Favotires is not displayed!");


    }
}