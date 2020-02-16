package pages.base_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasePage {

    public BasePage () {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText ="Contact")
    public WebElement contactsButton;


    @FindBy(xpath ="//input[@class='o_searchview_input']")
    public WebElement searchButton;



}
