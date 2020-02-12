package pages.create_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.login_page.LoginPage;
import utilities.Driver;

import java.time.LocalDate;

public class ContactCreationCompanyNegative {

    public ContactCreationCompanyNegative() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // email
    @FindBy(id = "login")
    public WebElement emailInput;

    // password
    @FindBy(id = "password")
    public WebElement passwordInput;

    //login
    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;

    @FindBy(xpath = "(//li/a/span)[4]")
    public WebElement contactsModule;

    @FindBy(xpath = "//button[@class = 'btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createButton;

    @FindBy(id = "radio204_company")
    public WebElement companyRadioButton;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(id = "o_field_input_210")
    public WebElement streetField;

    @FindBy(id = "o_field_input_211")
    public WebElement street2Field;

    @FindBy(id = "o_field_input_212")
    public WebElement cityField;


    @FindBy(id = "o_field_input_213")
    public WebElement stateChoose;

    @FindBy(xpath = "//a[.='USSR']")
    public WebElement USSRchoose;


    @FindBy(id = "o_field_input_214")
    public WebElement zipCode;

    @FindBy(id = "o_field_input_215")
    public WebElement country;

    @FindBy(xpath = "//a[.='ABCD']")
    public WebElement countryABCD;

    @FindBy(id = "o_field_input_216")
    public WebElement TIN;

    @FindBy(id = "o_field_input_217")
    public WebElement Tags;

    @FindBy(xpath = "//a[.='Wholesaler']")
    public WebElement TagsChooseWholeseler;

    @FindBy(xpath = "//a[.='Prospect']")
    public WebElement TagsChooseProspect;

    @FindBy(id = "o_field_input_219")
    public WebElement phone;

    @FindBy(id = "o_field_input_220")
    public WebElement mobile;

    @FindBy(id = "o_field_input_222")
    public WebElement email;

    @FindBy(id = "o_field_input_223")
    public WebElement website;

    @FindBy(id = "o_field_input_225")
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
