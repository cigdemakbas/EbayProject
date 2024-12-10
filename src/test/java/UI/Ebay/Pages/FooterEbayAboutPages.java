package UI.Ebay.Pages;

import UI.Ebay.Elements.FooterEbayAboutElements;
import UI.Ebay.Utilities.Utility;
import org.junit.Assert;

public class FooterEbayAboutPages extends Utility {
    FooterEbayAboutElements fle= new FooterEbayAboutElements();
    public void iScrollToTheFooterSection() {

    }
    public void iClickOnTheLink() {
        clickElement(fle.aboutEbay);
        waits(2);
    }
    public void iShouldBeNavigatedToThePage() {
        String expectedTitle="About eBay: Company Info, News, Careers, Investor Relations";
        String actualTitle=getCurrentPageTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
