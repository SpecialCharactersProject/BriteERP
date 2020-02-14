package pages.search_page;

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


    @FindBy(xpath = "//div[@class='o_searchview'][1]")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@class='o_searchview_more fa fa-search-plus']")
    public WebElement searchButton;

    @FindBy(xpath = "(//div[@class='btn-group o_dropdown']/button)[1]")
    public WebElement filters;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[2]")
    public WebElement groupBy;

    @FindBy(xpath = "//div[@class='btn-group o_dropdown'][2]")
    public WebElement favorites;



}
