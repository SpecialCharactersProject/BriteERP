package test.create_test;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.create_page.CompanyNegativeCreatePage;
import pages.create_page.CreatePage;
import pages.create_page.IndNegativeCreatePage;
import pages.login_page.LoginPage;
import test.base_test.BaseTest;
import utilities.BrightERPUtil;
import utilities.Driver;

public class CreateButtonSmokeTest extends BaseTest {
    CreatePage createPage = new CreatePage();
    IndNegativeCreatePage indNegativeContact = new IndNegativeCreatePage();
    CompanyNegativeCreatePage companyNegativeContact = new CompanyNegativeCreatePage();
    LoginPage log = new LoginPage();
    Faker faker = new Faker();

    @BeforeClass(groups = {"smokeTest"})
    public void setup() {

        log.login();
    }

//    @Test (groups = {"regressionTest"}, dependsOnGroups = {"smokeTest"}, priority=5)
//public void test_5() {...}

    @Test(groups = {"smokeTest"},priority=1)
    public void companyPositiveContactCreationTest(){
        BrightERPUtil.pause(2);
        createPage.contactsModule.click();
        BrightERPUtil.pause(2);
        createPage.createButton.click();
        Assert.assertTrue(createPage.individualRadioBtn.isSelected(), "Individual radio selection by default is FAILED");
        BrightERPUtil.pause(2);
        createPage.companyRadioButton.click();
        BrightERPUtil.pause(1);
        createPage.contactName.sendKeys(faker.name().firstName()+" "+faker.name().lastName());
        BrightERPUtil.pause(1);
        createPage.contactAddressStreet.sendKeys(faker.address().streetName());
        BrightERPUtil.pause(1);
        createPage.contactAddressCity.sendKeys(faker.address().city());
        createPage.addressStateBox.click();
        BrightERPUtil.pause(1);
        createPage.companyStateSelection.click();
        BrightERPUtil.pause(1);
        createPage.contactAddressZip.sendKeys(faker.address().zipCode());
        createPage.contactPhone.sendKeys(faker.phoneNumber().cellPhone());
        createPage.contactEmail.sendKeys("vvvvv@yahoo.com");
        createPage.contactWebsite.sendKeys("www.craxyland.com");
        createPage.saveBtn.click();
    }
    @Test(groups = {"smokeTest"},priority = 2)
    public void indPositiveContactCreationTest() {
        BrightERPUtil.pause(2);
        createPage.contactsModule.click();
        BrightERPUtil.pause(2);
        createPage.createButton.click();
        Assert.assertTrue(createPage.individualRadioBtn.isSelected(), "Individual radio selection by default is FAILED");
        BrightERPUtil.pause(1);
        createPage.individualRadioBtn.click();
        BrightERPUtil.pause(1);
        createPage.contactName.sendKeys(faker.name().firstName() + " " + faker.name().lastName());
        BrightERPUtil.pause(1);
        Actions action = new Actions(Driver.getDriver());
        action.doubleClick(createPage.indCompanyNameBox).perform();
        BrightERPUtil.pause(1);
        createPage.indCompanySelection.click();
        Select select=new Select(createPage.contactAddressTypeBox);
        select.selectByVisibleText("Shipping address");
        BrightERPUtil.pause(1);
        createPage.contactAddressStreet.sendKeys(faker.address().streetName());
        createPage.contactAddressCity.sendKeys(faker.address().city());
        BrightERPUtil.pause(1);
        createPage.addressStateBox.click();
        createPage.indAddressStateSelection.click();
        BrightERPUtil.pause(1);
        createPage.contactAddressZip.sendKeys(faker.address().zipCode());
        BrightERPUtil.pause(1);
        createPage.contactCountry.click();
        createPage.countrySelection.click();
        BrightERPUtil.pause(1);
        createPage.jobPosition.sendKeys(faker.job().title());
        BrightERPUtil.pause(1);
        createPage.contactPhone.sendKeys(faker.phoneNumber().cellPhone());
        BrightERPUtil.pause(1);
        createPage.contactEmail.sendKeys("superwoman@yyy.com");
        BrightERPUtil.pause(1);
        createPage.contactWebsite.sendKeys("www.cybertek.com");
        BrightERPUtil.pause(1);
        createPage.ContactTitleBox.click();
        createPage.ContactTitleSelection.click();
        BrightERPUtil.pause(2);
        createPage.saveBtn.click();
    }
    @Test(groups = {"smokeTest"},priority=3)
    public void discardButton(){
        BrightERPUtil.pause(2);
        createPage.contactsModule.click();
        BrightERPUtil.pause(2);
        createPage.createButton.click();
        Assert.assertTrue(createPage.individualRadioBtn.isSelected(), "Individual radio selection by default is FAILED");
        BrightERPUtil.pause(2);
        createPage.companyRadioButton.click();
        BrightERPUtil.pause(1);
        createPage.contactName.sendKeys(faker.name().firstName()+" "+faker.name().lastName());
        BrightERPUtil.pause(1);
        createPage.contactAddressStreet.sendKeys(faker.address().streetName());
        BrightERPUtil.pause(1);
        createPage.contactAddressCity.sendKeys(faker.address().city());
        createPage.addressStateBox.click();
        BrightERPUtil.pause(1);
        createPage.companyStateSelection.click();
        BrightERPUtil.pause(1);
        createPage.contactAddressZip.sendKeys(faker.address().zipCode());
        createPage.contactPhone.sendKeys(faker.phoneNumber().cellPhone());
        createPage.contactEmail.sendKeys("vvvvv@yahoo.com");
        createPage.contactWebsite.sendKeys("www.craxyland.com");
        BrightERPUtil.pause(3);
        createPage.discardBtn.click();
        createPage.alert.click();
    }
    @Test(groups = {"smokeTest"},priority=6)
    public void editContactButton() {
        try {
            BrightERPUtil.pause(3);
            createPage.contactsModule.click();
            BrightERPUtil.pause(1);
            createPage.editCreateButton.click();
            Assert.assertTrue(createPage.individualRadioBtn.isSelected(), "Individual radio selection by default is FAILED");
            BrightERPUtil.pause(3);
            createPage.companyRadioButton.click();
            BrightERPUtil.pause(1);
            createPage.contactName.sendKeys(faker.name().firstName() + " " + faker.name().lastName());
            BrightERPUtil.pause(1);
            createPage.contactAddressStreet.sendKeys(faker.address().streetName());
            BrightERPUtil.pause(1);
            createPage.contactAddressCity.sendKeys(faker.address().city());
            createPage.addressStateBox.click();
            BrightERPUtil.pause(1);
            createPage.companyStateSelection.click();
            BrightERPUtil.pause(1);
            createPage.contactAddressZip.sendKeys(faker.address().zipCode());
            createPage.contactPhone.sendKeys(faker.phoneNumber().cellPhone());
            createPage.contactEmail.sendKeys("vvvvv@yahoo.com");
            createPage.contactWebsite.sendKeys("www.craxyland.com");
            createPage.saveBtn.click();
            BrightERPUtil.pause(2);
            createPage.editBtn.click();
            BrightERPUtil.pause(2);
            createPage.contactName.sendKeys(faker.name().username());
            BrightERPUtil.pause(2);
            createPage.saveBtn.click();
        }catch (Exception e){
            System.out.println("Edit Button");
        }
    }
    @Test       (groups = {"smokeTest"},priority =4)
    public void indNegativeContactCreationTest() {
        indNegativeContact.contactsModule.click();
        BrightERPUtil.pause(1);
        indNegativeContact.createButton.click();
        Faker faker = new Faker();
        BrightERPUtil.pause(1);
        indNegativeContact.addressStreet1Individual.sendKeys(faker.address().streetAddress());
        indNegativeContact.addressStreet2Individual.sendKeys(faker.address().streetAddress());
        indNegativeContact.cityFieldInd.sendKeys(faker.address().cityName());
        indNegativeContact.stateFieldInd.click();
        indNegativeContact.BragaStateChoiceInd.click();
        indNegativeContact.zipInd.sendKeys(faker.address().zipCode());
        indNegativeContact.countryInd.click();
        indNegativeContact.ABCDcountryInd.click();
        indNegativeContact.TinInd.sendKeys(faker.idNumber().ssnValid());
        indNegativeContact.jobPositionInd.sendKeys(faker.job().position());
        indNegativeContact.phoneInd.sendKeys(faker.phoneNumber().cellPhone());
        indNegativeContact.mobileInd.sendKeys(faker.phoneNumber().phoneNumber());
        indNegativeContact.emailInd.sendKeys("thisIsFakeEmail@cybertek.com");
        indNegativeContact.websiteInd.sendKeys("www.cybertek.com");
        indNegativeContact.titleInd.click();
        WebElement titleProfesion = Driver.getDriver().findElement(By.linkText("Doctor"));
        titleProfesion.click();
        indNegativeContact.languageInd.click();
        BrightERPUtil.pause(2);
        Select select = new Select(indNegativeContact.languageInd);
        select.selectByVisibleText("English");
        BrightERPUtil.pause(2);
        indNegativeContact.languageInd.click();
        BrightERPUtil.pause(2);
        indNegativeContact.saveButtonInd.click();
        Assert.assertTrue(indNegativeContact.errorMessageInd.isDisplayed(), "Test FAILED");
        BrightERPUtil.pause(2);

    }
    @Test(groups = {"smokeTest"},priority = 5)
    public void companyNegativeContactCreationTest() {
        companyNegativeContact.contactsModule.click();
        BrightERPUtil.pause(2);

        companyNegativeContact.alertOk.click();

        BrightERPUtil.pause(2);
        companyNegativeContact.contactsModule.click();

        BrightERPUtil.pause(2);
        companyNegativeContact.createButton.click();
        BrightERPUtil.pause(2);
        companyNegativeContact.companyRadioButton.click();
        Faker faker = new Faker();
        companyNegativeContact.streetField.sendKeys(faker.address().streetName());
        companyNegativeContact.cityField.sendKeys(faker.address().city());
        companyNegativeContact.zipCode.sendKeys(faker.address().zipCode());
        companyNegativeContact.phone.sendKeys(faker.phoneNumber().cellPhone());
        companyNegativeContact.email.sendKeys("jjjjjjj@yahoo.com");
        BrightERPUtil.pause(2);
        companyNegativeContact.saveButton.click();
        BrightERPUtil.pause(3);
        Assert.assertTrue(companyNegativeContact.errorMessage.isDisplayed(), "Test FAILED");
    }


}
