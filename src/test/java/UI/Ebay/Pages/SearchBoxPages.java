package UI.Ebay.Pages;

import UI.Ebay.Elements.SearchBoxElements;
import UI.Ebay.Utilities.ConfigReader;
import UI.Ebay.Utilities.Driver;
import UI.Ebay.Utilities.Utility;
import org.junit.Assert;

public class SearchBoxPages extends Utility {
    String url= ConfigReader.getProperty("url");
    SearchBoxElements sbe= new SearchBoxElements();
    public void goToTheHomePage() {
        Driver.getDriver().get(url);
    }
    public void clickSearchBoxAndWrite() {

        sbe.searchBox.click();
        sbe.searchBox.sendKeys("soap");
     //   waits(1);
    }
    public void iClickTheSearchButton() {
        sbe.clickSB.click();
     //   waits(1);
    }
    public void userShouldSeeTheResults() {
        String expectedTitle = "Soap for sale | eBay";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);


       // System.out.println(expectedTitle);
       // System.out.println(actualTitle);

    }
    public void iShouldSeeAMessage() {
        String expectedResult = "No exact matches found";
        String actualResult = sbe.noExactMatch.getText();
        System.out.println(expectedResult + " " + actualResult);
        Assert.assertEquals(actualResult, expectedResult);
      
   }
    public void iEnterInValidProductOnSearchBox() {
        sbe.searchBox.click();
       // waits(1);
    }
    public void enterInvalidProduct() {
        sbe.searchBox.sendKeys("invalid23455");
        waits(1);
    }

}
