package Ebay.Pages;

import Ebay.Elements.SearchBoxElements;
import Ebay.Utilities.ConfigReader;
import Ebay.Utilities.Driver;
import Ebay.Utilities.Utility;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.swing.text.Utilities;

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
      //  Driver.getDriver().close();

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
        waits(1);
    }
    public void enterInvalidProduct() {
        sbe.searchBox.sendKeys("invalid23455");
        waits(1);
    }

}
