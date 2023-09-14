package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.ActionUtility;
import utility.Utility;

public class MouseOverPage extends WebTestBase {
    @FindBy(xpath ="//span[@id='nav-link-accountList-nav-line-1']")
    WebElement mouseOverElement;
    @FindBy(xpath ="//span[text()='Create a Wish List']")
    WebElement CreateWishList;
    @FindBy(xpath = "(//li[@id='my-lists-tab'])/a/div")
    WebElement yourLists;
    public MouseOverPage(){
        PageFactory.initElements(driver, this);
    }
    public void mouseOverAction1(){
        ActionUtility.mouseOverAction(mouseOverElement);}


    public void clickOnCreateWishlist(){
        Utility.explicitWaitForElement(CreateWishList);
    }
    public String createdWishLists(){return Utility.getTextOfElement(yourLists);}

}
