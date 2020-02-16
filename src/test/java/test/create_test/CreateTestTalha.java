package test.create_test;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.create_page.CreatePage;
import pages.login_page.LoginPage;
import test.base_test.BaseTest;
import utilities.BrightERPUtil;

public class CreateTestTalha extends BaseTest {
    LoginPage log = new LoginPage();
CreatePage createPage=new CreatePage();
Faker faker=new Faker();

    @BeforeClass
    public void setup() {

        log.login();
    }
    @Test
    public void editContactButton(){
        BrightERPUtil.pause(5);
        createPage.contactsModule.click();
        BrightERPUtil.pause(2);
        createPage.indCreateButton.click();

        Assert.assertTrue(createPage.individualRadioBtn.isSelected(), "Individual radio selection by default is FAILED");
        BrightERPUtil.pause(5);
        createPage.companyRadioButton.click();

        BrightERPUtil.pause(2);
        createPage.contactName.sendKeys(faker.name().firstName()+" "+faker.name().lastName());
        BrightERPUtil.pause(2);

        createPage.contactAddressStreet.sendKeys(faker.address().streetName());
        BrightERPUtil.pause(2);
        createPage.contactAddressCity.sendKeys(faker.address().city());
        createPage.addressStateBox.click();
        BrightERPUtil.pause(2);
        createPage.companyStateSelection.click();

        BrightERPUtil.pause(2);
        createPage.contactAddressZip.sendKeys(faker.address().zipCode());
        createPage.contactPhone.sendKeys(faker.phoneNumber().cellPhone());
        createPage.contactEmail.sendKeys("vvvvv@yahoo.com");
        createPage.contactWebsite.sendKeys("www.craxyland.com");
        createPage.saveBtn.click();

        BrightERPUtil.pause(3);
        createPage.editBtn.click();

        createPage.contactName.sendKeys(faker.name().username());

        BrightERPUtil.pause(3);
        createPage.saveBtn.click();
    }
}
