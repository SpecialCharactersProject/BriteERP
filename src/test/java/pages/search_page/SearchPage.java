package pages.search_page;

import org.openqa.selenium.By;
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





}
