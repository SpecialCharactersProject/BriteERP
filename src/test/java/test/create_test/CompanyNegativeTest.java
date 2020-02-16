package test.create_test;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.create_page.CompanyNegativeLocators;
import pages.create_page.CompanyNegativeLocators;
import pages.login_page.LoginPage;
import pages.login_page.LoginPageMilos;
import utilities.Driver;


public class CompanyNegativeTest {

    LoginPageMilos loginPage = new LoginPageMilos();
    CompanyNegativeLocators contactCreationCompanyNegative = new CompanyNegativeLocators();

    @BeforeClass
    public void loginToApp() {
        loginPage.loginBrightERP();
    }

    @Test        //   Company Contact Negative Scenario
    public void companyNegTest() {
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
//        Driver.getDriver().findElement(By.linkText("Services")).click();
//        Driver.getDriver().findElement(By.xpath("//button/span[.='Cancel']")).click();
//
        contactCreationCompanyNegative.phone.sendKeys(faker.idNumber().invalid());
        contactCreationCompanyNegative.mobile.sendKeys(faker.phoneNumber().cellPhone());
        contactCreationCompanyNegative.email.sendKeys("thisIsFakeEmail@cybertek.com");
        contactCreationCompanyNegative.website.sendKeys("www.cybertek.com");
        contactCreationCompanyNegative.Language.click();
        contactCreationCompanyNegative.Language.click();
        contactCreationCompanyNegative.saveButton.click();

        Assert.assertTrue(contactCreationCompanyNegative.errorMessage.isDisplayed(), "Test FAILED");
    }


}
