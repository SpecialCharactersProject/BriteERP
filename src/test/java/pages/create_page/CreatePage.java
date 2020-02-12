package pages.create_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.base_page.BasePage;
import utilities.Driver;

public class CreatePage extends BasePage {
    public CreatePage(){
        PageFactory.initElements(Driver.getDriver(),this
        );
    }

   @FindBy(className = "btn btn-primary btn-sm o-kanban-button-new btn-default")
   public WebElement createBtn;

   @FindBy(className = "btn btn-primary btn-sm o_form_button_save")
    public WebElement saveBtn;

   @FindBy(className = "btn btn-default btn-sm o_form_button_cancel")
    public WebElement discardBtn;

   @FindBy(id="radio202_person")
    public WebElement individualContactBtn;

   @FindBy(id="radio202_company")
    public WebElement companyContactBtn;

   @FindBy(className = "btn btn-primary btn-sm o_form_button_edit")
    public WebElement editBtn;






}
