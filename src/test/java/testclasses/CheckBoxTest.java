package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CheckboxPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;
import testbase.WebTestBase;

public class CheckBoxTest extends WebTestBase {
    public HomePage homePage;
    public CheckboxPage checkboxPage;

    CheckBoxTest(){
        super();
    }
    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        checkboxPage = new CheckboxPage();
    }

    @Test(description = "verify checkbox button selection")
    public void verifyCheckBoxButton()  {
        SoftAssert softAssert = new SoftAssert();
        checkboxPage.clickOnMobile();
        checkboxPage.clickOnCheckBox();
        softAssert.assertTrue(checkboxPage.checkBoxClick(), "Button should be selected");
        softAssert.assertAll();

    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }

}