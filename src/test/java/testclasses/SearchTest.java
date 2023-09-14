package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;
import testbase.WebTestBase;

public class SearchTest extends WebTestBase {
    public HomePage homePage;
    public LoginPage loginPage;
    public SearchPage searchPage;

    SearchTest(){
        super();
    }

    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        searchPage =new SearchPage();
    }
    @Test(description = "Verify search button")

    public void verifySearchButton() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickSearchTextBox();
        searchPage.enterSearchText(prop.getProperty("searchProduct"));
        softAssert.assertEquals(searchPage.searchIPhone14(),"iPhone 14. Big and bigger.","Text should be match");
        softAssert.assertAll();
    }

    @AfterMethod
      public void afterMethod(){
            driver.close();
        }



}
