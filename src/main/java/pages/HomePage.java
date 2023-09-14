package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class HomePage extends WebTestBase {
   @FindBy(xpath ="//span[@id='nav-link-accountList-nav-line-1']")
   WebElement clickOnSignIn;
    @FindBy(xpath ="//a[@id='icp-nav-flyout']")
    WebElement clickOnLanguage;
    @FindBy(xpath ="//span[text()='HI']")
    WebElement hindiRadioButton;
    @FindBy(xpath ="//input[@class='a-button-input']")
    WebElement clickOnSaveChanges;
    @FindBy(xpath ="//input[@id='twotabsearchtextbox']")
    WebElement searchTextBox;
    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    public void clickOnLogin(){
     Utility.explicitWaitForElement(clickOnSignIn);
    }
    public void clickOnLanguage(){
        Utility.explicitWaitForElement(clickOnLanguage);
    }
    public boolean clickOnHindi(){
       return Utility.isDisplayedElement(hindiRadioButton);
    }
    public void clickOnSaveChanges(){
        Utility.explicitWaitForElement(clickOnSaveChanges);
    }
    public void clickSearchTextBox(){Utility.explicitWaitForElement(searchTextBox);}
}
