package test.search_test;

import org.openqa.selenium.Keys;
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
    @Test
    public void verify_dropdownMenu_underSearchBtn() {
         BrightERPUtil.pause(3);
        //2 Click on Contact module
        loginPage.contactsButton.click();
        BrightERPUtil.pause(3);
        //3 Click on  seacrhButton and verify three dropdowns are displayed
        searchPage.searchButton.click();
        BrightERPUtil.pause(3);
        //verify that 3 dropdowns are displayed :Filters, GroupBy and Favorites
        Assert.assertTrue(searchPage.filters.isDisplayed(), "Filter is not displayed");
        Assert.assertTrue(searchPage.groupBy.isDisplayed(), "GroupBy is not displayed!");
        Assert.assertTrue(searchPage.favorites.isDisplayed(), "Favotires is not displayed!");

    }

    @Test
    public void enter_special_Character_in_searchBox(){

        BrightERPUtil.pause(2);
        loginPage.contactsButton.click();
        BrightERPUtil.pause(3);
        //verify search button is displayed
        Assert.assertTrue(searchPage.searchButton.isDisplayed(),"Search button is not displayed");
        //enter only one special character inside search box
        BrightERPUtil.pause(2);
        searchPage.searchInputBox.sendKeys("&"+Keys.ENTER);


    }

    @Test
    public void enter_name_in_searchBox(){
        BrightERPUtil.pause(3);
        loginPage.contactsButton.click();
        BrightERPUtil.pause(3);
        //enter a name inside search box
        searchPage.searchInputBox.sendKeys("Alice"+Keys.ENTER);
    }

}