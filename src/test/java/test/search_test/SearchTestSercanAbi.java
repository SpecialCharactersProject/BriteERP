package test.search_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.base_page.BasePage;
import pages.login_page.LoginPage;
import pages.search_page.SearchPage;
import test.base_test.BaseTest;
import utilities.BrightERPUtil;
import utilities.ConfigurationReader;
import utilities.Driver;

import javax.swing.text.Utilities;
import java.util.List;
import java.util.WeakHashMap;

public class SearchTestSercanAbi extends BaseTest {

    LoginPage loginPage = new LoginPage();
    SearchPage searchPage = new SearchPage();
    BasePage basePage = new BasePage();
    BrightERPUtil util = new BrightERPUtil();

    @BeforeClass
    public void setUp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.usernameInputBox.sendKeys((ConfigurationReader.getProperty("username2")));
        loginPage.passwordInputBox.sendKeys((ConfigurationReader.getProperty("password2")));
        loginPage.loginButton.click();
        basePage.contactsButton.click();
        util.pause(5);

    }

    @Test(priority = 1)
    public void searchBoxPartialText() {

        //Enter partial of the text of search. User should see all the contacts which have the entered characters in the list
        searchPage.searchInputBox.sendKeys("adel");
        List<WebElement> names = Driver.getDriver().findElements(By.xpath("//div[@class='oe_kanban_global_click o_res_partner_kanban o_kanban_record']"));
        for (WebElement listName : names) {
            String actualName = listName.getText();
            Assert.assertTrue(actualName.equals("adel"));

        }
    }


    @Test(priority = 3)
    public void searchBoxFavorite()
    {

        searchPage.searchBoxPlusButton.click();
        //Click on Favorites. User should see two submodule underneath "Save Current Search" and "Add to my Dashboard"
        searchPage.favoritesButton.click();
        if(searchPage.saveCurrentSearch.isDisplayed()&&searchPage.addToMyDashboard.isDisplayed()){}

        //Click on Save Current Search. User should be able to save the search.
            // User should also have the options to save either "Use by default" or "Share with other users"
        searchPage.saveCurrentSearch.click();
        searchPage.favoritesSaveSearch.clear();
        searchPage.favoritesSaveSearch.sendKeys("Companies");
        searchPage.saveSearchButton.sendKeys();
        Assert.assertTrue(searchPage.savedFavoriteDisplay.isDisplayed());
        /*Click on Add to my dashboard. User should be able to add the search to the dashboard
        for future use under Dashboard module*/

        searchPage.addToMyDashboard.click();
        searchPage.addToDashboardInputBox.sendKeys("Companies");
        searchPage.addToDashboardButton.click();
        Assert.assertTrue(searchPage.popUpDisplayText.isDisplayed());


    }


    @Test(priority = 2)
    public void searchBoxFilter()
    {
        //Click on plus button in search box
        searchPage.searchBoxPlusButton.click();

        //User should see three modules underneath searchbox
        if(searchPage.filterSearchButton.isDisplayed())
            //Click on filter
            searchPage.filterSearchButton.click();

        //Dropdown menu opens and user should see preset filters
        if(searchPage.filterDropdownMenu.isDisplayed())
            searchPage.dropDownList.click();

        //Click on preset option to filter. User should see only the filtered contacts
        Assert.assertTrue(searchPage.searchedValue.isDisplayed());
        //Choose more than one preset option to filter. User should see the contact that are filtered by all options.
        searchPage.searchedSecondValue.click();
        Assert.assertTrue(searchPage.searchedValue.isDisplayed()&&searchPage.searchedSecondValue.isDisplayed());


    }


    }
