package UI.Ebay.StepDefinitions;

import UI.Ebay.Elements.SearchBoxElements;
import UI.Ebay.TestBase;
import UI.Ebay.Utilities.ConfigReader;
import UI.Ebay.Utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.netty.handler.codec.http.TooLongHttpHeaderException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EbaySimpleSteps extends TestBase {
    String url= ConfigReader.getProperty("url");
    SearchBoxElements sbe= new SearchBoxElements();
    @Then("I search for the following items:")
    public void iSearchForTheFollowingItems(DataTable dt) throws InterruptedException {

        sbe.searchBox.click();

        List<String> searchTerms = dt.asList();

        for (int i = 1; i < searchTerms.size(); i++) {

            String searchTerm = searchTerms.get(i);

            // Click and focus on the search box (ensure proper focus)
            sbe.searchBox.click();

            // Clear the search box before entering the new term
            sbe.searchBox.clear();

            // Enter the search term
            sbe.searchBox.sendKeys(searchTerm);
            Thread.sleep(1000);
            // Click the search button
            sbe.clickSB.click();

            WebElement resultsHeader = Driver.getDriver().findElement(By.cssSelector(".srp-controls__count-heading"));
            System.out.println("Search for '" +searchTerm + "' successful: " + resultsHeader.getText());

           Driver.getDriver().navigate().to(url);
        }
    }
        @Then("I should see relevant search results for all items")
        public void iShouldSeeRelevantSearchResultsForAllItems () {


            // Validate search results page


        }
    }

