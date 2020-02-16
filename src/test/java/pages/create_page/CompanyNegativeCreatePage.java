package pages.create_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.logging.XMLFormatter;

public class CompanyNegativeCreatePage {
    public CompanyNegativeCreatePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//li/a/span)[4]")
    public WebElement contactsModule;
    @FindBy(xpath = "//button[@class = 'btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createButton;
    @FindBy(xpath = "//input[@data-value='company']")
    public WebElement companyRadioButton;
    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;
    @FindBy(xpath = "//input[@name='street']")
    public WebElement streetField;
    @FindBy(xpath = "//input[@name='street2']")
    public WebElement street2Field;
    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityField;
    @FindBy(xpath = "(//input[@type='text'])[10]")
    public WebElement stateChoose;
    @FindBy(xpath = "//a[contains(text(),'USSR')]")
    public WebElement USSRchoose;
    @FindBy(xpath = "//input[@name='zip']")
    public WebElement zipCode;
    @FindBy(xpath = "(//input[@type='text'])[12]")
    public WebElement country;
    @FindBy(xpath = "//a[.='ABCD']")
    public WebElement countryABCD;
    @FindBy(xpath = "//input[@name='vat']")
    public WebElement TIN;
    @FindBy(id = "o_field_input_218")
    public WebElement Tags;
    @FindBy(xpath = "//a[.='Wholesaler']")
    public WebElement TagsChooseWholeseler;
    @FindBy(xpath = "//a[.='Prospect']")
    public WebElement TagsChooseProspect;
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phone;
    @FindBy(xpath = "//input[@name='mobile']")
    public WebElement mobile;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;
    @FindBy(xpath = "//input[@name='website']")
    public WebElement website;
    @FindBy(xpath = "//select[@name='lang']")
    public WebElement Language;
    @FindBy(xpath = "//option[.='English']")
    public WebElement LanguageChooseEnglish;
    @FindBy(xpath = "//div[@class='o_notification_title']")
    public WebElement errorMessage;

    @FindBy(xpath = "//button[@class='close']")

    public  WebElement alert;


    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement alertOk;
}
