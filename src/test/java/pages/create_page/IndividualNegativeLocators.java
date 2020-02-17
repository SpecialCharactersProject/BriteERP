package pages.create_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IndividualNegativeLocators {
    public IndividualNegativeLocators () {
        PageFactory.initElements(Driver.getDriver(),this);
    }
// INDIVIDUAL LOCATORS !!!

    @FindBy(xpath = "(//div[@class ='o_field_radio o_horizontal o_field_widget oe_edit_only']//input)[1]")
   public WebElement individualRadioButton;

//    @FindBy(xpath = "(//div[@class ='o_field_radio o_horizontal o_field_widget oe_edit_only']//input)[2]")
//    public WebElement companyBtnUnderIndividual;

    @FindBy ( xpath = "//input[@name='street']")
    public WebElement addressStreet1Individual;

    @FindBy (xpath = "//input[@name='street2']" )
    public WebElement addressStreet2Individual;

   @FindBy(xpath = "//input[@name='city']")
   public WebElement cityFieldInd;

   @FindBy (xpath = "(//div/input[@type='text'])[7]")
   public WebElement stateFieldInd;

   @FindBy(xpath = "//a[.='Braga']")
   public WebElement BragaStateChoiceInd;

 @FindBy(xpath = "//input[@name='zip']")
 public WebElement zipInd;

 @FindBy(xpath = "(//div/input[@type='text'])[9]")
 public WebElement countryInd;

 @FindBy(linkText = "ABCD")
 public WebElement ABCDcountryInd;

 @FindBy(xpath = "//input[@name='vat']")
 public WebElement TinInd;

 // //button[@accesskey='s']

    @FindBy (xpath = "//input[@name='function']")
    public WebElement jobPositionInd;

    @FindBy (xpath = "//input[@name='phone']")
    public WebElement phoneInd;

    @FindBy (xpath = "//input[@name='mobile']")
    public WebElement mobileInd;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement emailInd;


    @FindBy (xpath = "//input[@name='website']")
    public WebElement websiteInd;

    @FindBy (xpath = "(//input[@type='text'])[20]")
    public WebElement titleInd;

    @FindBy (xpath = "//select[@name='lang']")
    public WebElement languageInd;

    @FindBy (xpath = "//button[@accesskey='s']")
    public WebElement saveButtonInd;

    //div[@class='o_notification_title']

    @FindBy (xpath = " //div[@class='o_notification_title']")
    public WebElement errorMessageInd;


    // COMPANY LOCATORS !!!!

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

    @FindBy(id = "radio205_company")
    public WebElement companyRadioButton;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(id = "o_field_input_211")
    public WebElement streetField;

    @FindBy(id = "o_field_input_212")
    public WebElement street2Field;

    @FindBy(id = "o_field_input_213")
    public WebElement cityField;


    @FindBy(id = "o_field_input_214")
    public WebElement stateChoose;

    @FindBy(xpath = "//a[.='USSR']")
    public WebElement USSRchoose;


    @FindBy(id = "o_field_input_215")
    public WebElement zipCode;

    @FindBy(id = "o_field_input_216")
    public WebElement country;

    @FindBy(xpath = "//a[.='ABCD']")
    public WebElement countryABCD;

    @FindBy(id = "o_field_input_217")
    public WebElement TIN;

    @FindBy(id = "o_field_input_217")
    public WebElement Tags;

    @FindBy(xpath = "//a[.='Wholesaler']")
    public WebElement TagsChooseWholeseler;

    @FindBy(xpath = "//a[.='Prospect']")
    public WebElement TagsChooseProspect;

    @FindBy(id = "o_field_input_220")
    public WebElement phone;

    @FindBy(id = "o_field_input_221")
    public WebElement mobile;

    @FindBy(id = "o_field_input_223")
    public WebElement email;

    @FindBy(id = "o_field_input_224")
    public WebElement website;

    @FindBy(id = "o_field_input_226")
    public WebElement Language;

    @FindBy(xpath = "//option[.='English']")
    public WebElement LanguageChooseEnglish;

    @FindBy(xpath = "//div[@class='o_notification_title']")
    public WebElement errorMessage;

    // this is extra

    @FindBy (xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement okButtonIndividual;


}
