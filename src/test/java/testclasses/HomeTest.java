package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import testbase.WebTestBase;

public class HomeTest extends WebTestBase {
    public HomePage homePage;
    public LoginPage loginPage;
    HomeTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(description = "Verify Radio Button Selection")
    public void verifyRadioBtnByChangingLanguage() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnLanguage();
        homePage.clickOnHindi();
        homePage.clickOnSaveChanges();
        softAssert.assertTrue(homePage.clickOnHindi(), "Button should be selected");
        softAssert.assertAll();
    }
    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}

