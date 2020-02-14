package pages.create_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreatePage {
    public CreatePage() {
        PageFactory.initElements(Driver.getDriver(), this
        );
    }

    @FindBy(xpath = "(//li/a/span)[4]")
    public WebElement contactsModule;

    @FindBy(className = "btn btn-primary btn-sm o-kanban-button-new btn-default")
    public WebElement createBtn;

    @FindBy(className = "btn btn-primary btn-sm o_form_button_save")
    public WebElement saveBtn;

    @FindBy(className = "btn btn-default btn-sm o_form_button_cancel")
    public WebElement discardBtn;

    @FindBy(id = "radio202_person")
    public WebElement individualRadioBtn;

    @FindBy(id = "radio202_company")
    public WebElement companyContactBtn;

    @FindBy(className = "btn btn-primary btn-sm o_form_button_edit")
    public WebElement editBtn;

    @FindBy(id = "o_field_input_384")
    public WebElement indContactName;

    @FindBy(id = "o_field_input_388")
    public WebElement indAddressStreet;

    @FindBy(id = "o_field_input_390")
    public WebElement indAddressCity;

    @FindBy(id = "o_field_input_392")
    public WebElement indAddressZip;

    @FindBy(id = "o_field_input_396")
    public WebElement indJobPosition;

    @FindBy(id = "o_field_input_397")
    public WebElement indPhone;

    @FindBy(id = "o_field_input_400")
    public WebElement indEmail;



    @FindBy(xpath = "//button[@class = 'btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createButton;

    @FindBy(id = "radio204_company")
    public WebElement companyRadioButton;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement companySaveButton;

    @FindBy(id = "o_field_input_210")
    public WebElement companyStreetField;

    @FindBy(id = "o_field_input_211")
    public WebElement companyStreet2Field;
    @FindBy(id = "o_field_input_212")
    public WebElement companyCityField;
    @FindBy(id = "o_field_input_213")
    public WebElement comapanyStateChoose;
    @FindBy(xpath = "//a[.='USSR']")
    public WebElement companyUSSRchoose;
    @FindBy(id = "o_field_input_214")
    public WebElement companyZipCode;
    @FindBy(id = "o_field_input_215")
    public WebElement companyCountry;
    @FindBy(xpath = "//a[.='ABCD']")
    public WebElement companyCountryABCD;
    @FindBy(id = "o_field_input_216")
    public WebElement companyTIN;
    @FindBy(id = "o_field_input_217")
    public WebElement companyTags;
    @FindBy(xpath = "//a[.='Wholesaler']")
    public WebElement companyTagsChooseWholeseler;
    @FindBy(xpath = "//a[.='Prospect']")
    public WebElement companyTagsChooseProspect;
    @FindBy(id = "o_field_input_219")
    public WebElement  companyPhone;
    @FindBy(id = "o_field_input_220")
    public WebElement companyMobile;
    @FindBy(id = "o_field_input_222")
    public WebElement companyEmail;
    @FindBy(id = "o_field_input_223")
    public WebElement companyWebsite;
    @FindBy(id = "o_field_input_225")
    public WebElement companyLanguage;
    @FindBy(xpath = "//option[.='English']")
    public WebElement companyLanguageChooseEnglish;

    @FindBy(xpath = "//div[@class='o_notification_title']")
    public WebElement companyErrorMessage;


}
