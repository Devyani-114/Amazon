package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MouseOverPage;
import pages.SearchPage;
import testbase.WebTestBase;

public class MouseOverTest extends WebTestBase {
    public HomePage homePage;
    public MouseOverPage mouseOverPage;

    MouseOverTest(){
        super();
    }

    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage = new HomePage();
        mouseOverPage = new MouseOverPage();
    }
    @Test(description = "Verify Mouse Over Action")
    public void verifyMouseOverAction(){
        SoftAssert softAssert = new SoftAssert();
        mouseOverPage.mouseOverAction1();
        mouseOverPage.clickOnCreateWishlist();
        softAssert.assertEquals(mouseOverPage.createdWishLists(),"Your Lists","Text should be match");
        softAssert.assertAll();
    }

   @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}

