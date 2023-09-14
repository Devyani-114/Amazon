package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class LoginPage extends WebTestBase {

    @FindBy(xpath ="//input[@id='ap_email']")
    WebElement emailTextBox;
    @FindBy(xpath ="//input[@id='continue']")
    WebElement clickOnContinue;
    @FindBy(xpath ="//input[@id='ap_password']")
    WebElement passwordTextBox;
    @FindBy(xpath = "//input[@id='signInSubmit']")
    WebElement signInBtn;

    @FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
    WebElement MyAccount;
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
    public void login(String username, String password){
        emailTextBox.sendKeys(username);
        clickOnContinue.click();
        passwordTextBox.sendKeys(password);
        signInBtn.click();
    }

    public String clickOnSignIn(){
       return Utility.getTextOfElement(MyAccount);
    }
}