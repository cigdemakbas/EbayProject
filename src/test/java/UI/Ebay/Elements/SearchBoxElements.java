package UI.Ebay.Elements;

import UI.Ebay.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBoxElements {
    public SearchBoxElements (){

        PageFactory.initElements(Driver.getDriver(),this);
    }
  @FindBy  (id = "gh-ac")
    public WebElement searchBox;

    @FindBy (id= "gh-btn")
    public WebElement clickSB;
    @FindBy (xpath = "(//h3[normalize-space()='No exact matches found'])[1]")
    public WebElement noExactMatch;

//    @FindBy()
//    public WebElement

}
