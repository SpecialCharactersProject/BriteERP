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

    @FindBy(className = "btn btn-primary btn-sm o-kanban-button-new btn-default")
    public WebElement createBtn;

    @FindBy(className = "btn btn-primary btn-sm o_form_button_save")
    public WebElement saveBtn;

    @FindBy(className = "btn btn-default btn-sm o_form_button_cancel")
    public WebElement discardBtn;

    @FindBy(id = "radio202_person")
    public WebElement individualContactBtn;

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

    @FindBy(id="o_field_input_400")
    public WebElement indEmail;


}
