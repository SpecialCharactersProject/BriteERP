package pages.search_page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.base_page.BasePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class SearchPage extends BasePage {


    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchButton;

    @FindBy(xpath = "(//div[@class='btn-group o_dropdown']/button)[1]")
    public WebElement filters;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[2]")
    public WebElement groupBy;

    @FindBy(xpath = "//div[@class='btn-group o_dropdown'][2]")
    public WebElement favorites;

    @FindBy (xpath = "//span[@class='o_facet_values_sep']")
    public WebElement afterEnteringInSearchBox;

    @FindBy (xpath = "//button[@accesskey='l']")
    public WebElement listButton;

    @FindBy (xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']")
    public WebElement listTable;

    @FindBy (xpath = "//button[@accesskey='k']")
    public WebElement kanbanButton;

    @FindBy (xpath = "//div[@class='o_kanban_view o_res_partner_kanban o_kanban_ungrouped']")
    public WebElement kanbanTable;

    @FindBy(xpath = "//span[@class='o_pager_value']")
    public WebElement numOfElementsDisplayed;





//    public  SearchPage(){
//        PageFactory.initElements(Driver.getDriver(), this);
//
//    }

    @FindBy(css=".o_searchview_input")
    public WebElement searchInputBox;

    @FindBy(css=".fa-search-plus")
    public WebElement searchBoxPlusButton;

    @FindBy(xpath="//button[contains(., 'Filters')]")
    public WebElement filterSearchButton;

    @FindBy(css = ".o_view_manager_content")
    public WebElement searchBoxResultContent;

    @FindBy(css=".o_filters_menu")
    public WebElement filterDropdownMenu;

    @FindBy(xpath = "//a[contains(text(), '')]")
    public WebElement dropDownList;

    @FindBy(xpath="//span[contains(text(),'My Partners')]")
    public WebElement searchedValue;

    @FindBy(xpath = "//a[contains(text(),'Persons')]")
    public WebElement searchedSecondValue;

    @FindBy(xpath="//button[contains(., 'Favorites')]")
    public WebElement favoritesButton;

    @FindBy(xpath = "//*[contains(text(),'Save current')]")
    public WebElement saveCurrentSearch;

    @FindBy(xpath = "//*[contains(text(),'my Dashboard')]")
    public WebElement addToMyDashboard;

    @FindBy (xpath = ".o_save_name")
    public WebElement favoritesSaveSearch;

    @FindBy(xpath = "//button[contains(., 'Save')]")
    public WebElement saveSearchButton;

    @FindBy(xpath = "//button[contains(., 'Add')]")
    public WebElement addToDashboardButton;

    @FindBy(css="o-searchview-custom-private selected")
    public WebElement savedFavoriteDisplay;

    @FindBy(css=".o_add_to_dashboard_input")
    public WebElement addToDashboardInputBox;

    @FindBy(css=".o_notification_title")
    public WebElement popUpDisplayText;

    @FindBy(xpath = "//div[@class='oe_kanban_global_click o_res_partner_kanban o_kanban_record']")
    public WebElement listOfSearchedNames;

    public void navigateToAdvancedSearchTabs(WebDriver driver, String tab)
    {
        String tabLocatorXpath="//button[contains(., '"+tab+"')]";

        driver.findElement(By.xpath(tabLocatorXpath)).click();

    }

    public void findNameInDisplay(WebDriver driver, String name){

        String xpathLocator="//span[contains(text(), '"+name+"')]";
        driver.findElement(By.xpath(xpathLocator));

    }


}
