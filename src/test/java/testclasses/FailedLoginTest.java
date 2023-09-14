package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import testbase.WebTestBase;

public class FailedLoginTest extends WebTestBase {

        public HomePage homePage;

        public LoginPage loginPage;

        FailedLoginTest(){
            super();
        }

        @BeforeMethod
        public void beforeMethod(){
            initialization();
            homePage = new HomePage();
            loginPage = new LoginPage();
        }

        @Test(description = "Verify login with valid username and valid password")
        public void verifyLoginWithValidEmailAndValidPassword(){
            SoftAssert softAssert = new SoftAssert();
            homePage.clickOnLogin();
            loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
            softAssert.assertEquals(loginPage.clickOnSignIn(),"Hello Devyani","Text should be match");
            softAssert.assertAll();
        }
        @AfterMethod
        public void afterMethod(){
            driver.close();
        }
    }
