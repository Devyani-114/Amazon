package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class SearchPage extends WebTestBase {
    @FindBy(xpath ="//input[@id='twotabsearchtextbox']")
    WebElement searchTextBox;

    @FindBy(xpath ="//input[@id='nav-search-submit-button']")
    WebElement clickOnSearch;

    @FindBy(xpath = "(//span[@class='a-truncate-cut'])[1]")
    WebElement searchedProduct;
    public SearchPage(){
        PageFactory.initElements(driver, this);
    }

    public void enterSearchText(String searchProduct){
        searchTextBox.click();
        searchTextBox.sendKeys(searchProduct);
        clickOnSearch.click();
    }
    public String searchIPhone14(){
        return Utility.getTextOfElement(searchedProduct);
    }
}
