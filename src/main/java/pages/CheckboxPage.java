package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class CheckboxPage extends WebTestBase {
    @FindBy(xpath ="//div[@id='nav-xshop']/a[4]")
    WebElement mobileButton;
    @FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[4]")
    WebElement iQQMobile;
    public CheckboxPage(){
        PageFactory.initElements(driver, this);
    }
    public void clickOnMobile(){
        Utility.explicitWaitForElement(mobileButton);
    }
    public void clickOnCheckBox(){
        Utility.explicitWaitForElement(iQQMobile);

    }
    public boolean checkBoxClick() {
       return Utility.isDisplayedElement(iQQMobile);
    }

}