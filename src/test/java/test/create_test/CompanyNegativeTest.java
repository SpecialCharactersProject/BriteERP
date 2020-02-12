package test.create_test;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.create_page.ContactCreationCompanyNegative;
import pages.login_page.LoginPage;


public class CompanyNegativeTest {

    LoginPage loginPage = new LoginPage();
    ContactCreationCompanyNegative contactCreationCompanyNegative = new ContactCreationCompanyNegative();

    @BeforeMethod
    public void loginToApp() {
        loginPage.loginBrightERP();
    }

    @Test        //  Create Company Contact Negative Scenario
    public void companyNegTest() throws InterruptedException {
        contactCreationCompanyNegative.contactsModule.click();
        contactCreationCompanyNegative.createButton.click();
        contactCreationCompanyNegative.companyRadioButton.click();
        Faker faker = new Faker();
        contactCreationCompanyNegative.streetField.sendKeys(faker.address().streetAddress());
        contactCreationCompanyNegative.street2Field.sendKeys(faker.address().streetAddress());
        contactCreationCompanyNegative.cityField.sendKeys(faker.address().cityName());
        contactCreationCompanyNegative.stateChoose.click();
        contactCreationCompanyNegative.USSRchoose.click();
        contactCreationCompanyNegative.zipCode.sendKeys(faker.address().zipCode());
        contactCreationCompanyNegative.country.click();
        contactCreationCompanyNegative.countryABCD.click();
        contactCreationCompanyNegative.TIN.sendKeys(faker.idNumber().ssnValid());
//        contactCreationCompanyNegative.Tags.click();
//        contactCreationCompanyNegative.TagsChooseWholeseler.click();
        contactCreationCompanyNegative.phone.sendKeys(faker.idNumber().invalid());
        contactCreationCompanyNegative.mobile.sendKeys(faker.phoneNumber().cellPhone());
        contactCreationCompanyNegative.email.sendKeys("thisIsFakeEmail@cybertek.com");
        contactCreationCompanyNegative.website.sendKeys("www.cybertek.com");
        contactCreationCompanyNegative.Language.click();
        contactCreationCompanyNegative.Language.click();
        contactCreationCompanyNegative.saveButton.click();

        Assert.assertTrue(contactCreationCompanyNegative.errorMessage.isDisplayed());
    }


}
