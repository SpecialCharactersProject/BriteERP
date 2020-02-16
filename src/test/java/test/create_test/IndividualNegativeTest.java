package test.create_test;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.create_page.CompanyNegativeLocators;
import pages.create_page.IndividualNegativeLocators;
import pages.login_page.LoginPageMilos;
import utilities.Driver;

public class IndividualNegativeTest {

    LoginPageMilos loginPage = new LoginPageMilos();
    IndividualNegativeLocators individualNegativeLocators = new IndividualNegativeLocators();

    @BeforeClass
    public void loginToApp() {
        loginPage.loginBrightERP();
    }

    @Test        //   Individual Contact Creation Negative Scenario
    public void individualNegTest() {
        individualNegativeLocators.contactsModule.click();
        individualNegativeLocators.createButton.click();
//        individualNegativeLocators.companyRadioButton.click();

//       individualNegativeLocators.individualRadioButton.click();
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

        Assert.assertTrue(individualNegativeLocators.errorMessageInd.isDisplayed(),"Test FAILED");

    }
}