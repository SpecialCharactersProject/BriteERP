package pages.base_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasePage {

    public BasePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(partialLinkText = "Contacts")
    public WebElement contactsModuleTab;


    @FindBy(xpath = "(//li/a/span)[4]")
    public WebElement contactsModule;

    @FindBy(partialLinkText = "//input[@class='o_searchview_input']")
    public WebElement searchButton;



}
