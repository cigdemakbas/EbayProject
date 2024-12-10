package UI.Ebay.Elements;

import UI.Ebay.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterEbayAboutElements {
    public FooterEbayAboutElements (){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//a[@class='gf-bttl thrd'][normalize-space()='About eBay']")
    public WebElement aboutEbay;

}
