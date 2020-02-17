package test.create_test;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.create_page.CreatePage;
import pages.login_page.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class CreateTestVenera {
    @BeforeClass
    public void test() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }

    @Test
    public void testIndividualContactCreation() {
        CreatePage createPage = new CreatePage();
//        createPage.createBtn.click();

        Assert.assertTrue(createPage.individualRadioBtn.isSelected(), "Individual radio selection by default is FAILED");
        createPage.individualRadioBtn.click();

        Faker faker = new Faker();
        createPage.individualRadioBtn.sendKeys(faker.name().firstName() + " " + faker.name().lastName());




    }


}
