package pages.create_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.login_page.LoginPage;
import utilities.Driver;

import java.time.LocalDate;

public class CompanyNegativeLocators {

    public CompanyNegativeLocators() {
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

    @FindBy(xpath = "//a[.='USSR']")
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


//1
//    Click on "Create" button

//    New Contact create window should displayed with page fields
//2
//    Click on "Company" radio button

//    Contact creation window for company without "Job Title" and "Position" fields should displayed
//3
//    Click on "Save" button without filling the "name" field

//    New contact information without filling "name" field should throw an error message "The following field is invalid. Name "

    // http://app.briteerp.com/web/login

//    @FindBy ()


}
