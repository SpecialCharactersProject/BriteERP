package test.create_test;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.create_page.CompanyNegativeLocators;
import pages.create_page.IndividualNegativeLocators;
import pages.login_page.LoginPage;
import pages.login_page.LoginPageMilos;
import test.base_test.BaseTest;
import utilities.Driver;

public class CreateTestMilos extends BaseTest {

    LoginPageMilos loginPage = new LoginPageMilos();

    IndividualNegativeLocators individualNegativeLocators = new IndividualNegativeLocators();

    CompanyNegativeLocators contactCreationCompanyNegative = new CompanyNegativeLocators();

    @BeforeMethod
    public void loginToApp() {
        loginPage.loginBrightERP();
    }


    @Test        //   Individual Contact Creation Negative Scenario
    public void individualNegTest() {
        individualNegativeLocators.contactsModule.click();
        individualNegativeLocators.createButton.click();
        Faker faker = new Faker();
        individualNegativeLocators.addressStreet1Individual.sendKeys(faker.address().streetAddress());
        individualNegativeLocators.addressStreet2Individual.sendKeys(faker.address().streetAddress());
        individualNegativeLocators.cityFieldInd.sendKeys(faker.address().cityName());
        individualNegativeLocators.stateFieldInd.click();
        individualNegativeLocators.BragaStateChoiceInd.click();
        individualNegativeLocators.zipCode.sendKeys(faker.address().zipCode());
        individualNegativeLocators.countryInd.click();
        individualNegativeLocators.ABCDcountryInd.click();
        individualNegativeLocators.TinInd.sendKeys(faker.idNumber().ssnValid());
        individualNegativeLocators.jobPositionInd.sendKeys(faker.job().position());
        individualNegativeLocators.phoneInd.sendKeys(faker.phoneNumber().cellPhone());
        individualNegativeLocators.mobileInd.sendKeys(faker.phoneNumber().phoneNumber());
        individualNegativeLocators.emailInd.sendKeys("thisIsFakeEmail@cybertek.com");
        individualNegativeLocators.websiteInd.sendKeys("www.cybertek.com");
        individualNegativeLocators.titleInd.click();
        WebElement titleProfesion = Driver.getDriver().findElement(By.linkText("Doctor"));
        titleProfesion.click();
        individualNegativeLocators.languageInd.click();

        Select select = new Select(individualNegativeLocators.languageInd);
        select.selectByVisibleText("English");
        individualNegativeLocators.languageInd.click();
        individualNegativeLocators.saveButtonInd.click();

        Assert.assertTrue(individualNegativeLocators.errorMessageInd.isDisplayed(), "Test FAILED");

    }


    @Test(priority = 1)     //   Company Contact Creation Negative Scenario
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
