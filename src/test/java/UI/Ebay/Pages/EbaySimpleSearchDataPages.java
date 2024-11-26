package UI.Ebay.Pages;

import UI.Ebay.Elements.SearchBoxElements;
import UI.Ebay.Utilities.ConfigReader;
import UI.Ebay.Utilities.Driver;
import UI.Ebay.Utilities.Utility;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EbaySimpleSearchDataPages extends Utility {
    String url= ConfigReader.getProperty("url");
    SearchBoxElements sbe= new SearchBoxElements();
    public void iSearchForTheFollowingItems(DataTable dt) {
        sbe.searchBox.click();
        List <String> searchTerms= dt.asList();
        for (String searchTerm : searchTerms) {
            // Enter search term
            WebElement searchBox = Driver.getDriver().findElement((By.id("gh-ac")));
            searchBox.clear();
            searchBox.sendKeys(searchTerm);

            // Click search button
            WebElement searchButton = Driver.getDriver().findElement(By.id("gh-btn"));
            searchButton.click();

            // Validate search results page
            WebElement resultsHeader = Driver.getDriver().findElement(By.cssSelector(".srp-controls__count-heading"));
            System.out.println("Search for '" + searchTerm + "' successful: " + resultsHeader.getText());

            // Go back to the homepage for the next search
            Driver.getDriver().navigate().to("https://www.ebay.com");
        }
    }
}
