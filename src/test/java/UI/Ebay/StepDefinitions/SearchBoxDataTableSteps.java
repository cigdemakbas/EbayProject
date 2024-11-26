package UI.Ebay.StepDefinitions;

import UI.Ebay.Elements.SearchBoxElements;
import UI.Ebay.Utilities.ConfigReader;
import UI.Ebay.Utilities.Driver;
import UI.Ebay.Utilities.Utility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class SearchBoxDataTableSteps extends Utility {
    SearchBoxElements sbe= new SearchBoxElements();
    String url= ConfigReader.getProperty("url");
    @When("I search with the following criteria:")
    public void iSearchWithTheFollowingCriteria(DataTable dt) {

        List<Map<String, String>> for2column = dt.asMaps();


        for (Map<String, String> column : for2column) {
            String searchTerm = column.get("searchTerm");
            String category = column.get("category");
            // Input search term
            WebElement searchBox = Driver.getDriver().findElement(By.id("gh-ac"));
            searchBox.clear();
            searchBox.sendKeys(searchTerm);



            // Click search


            if (category != null && !category.isEmpty()) {
                // Find the category dropdown and select the category
                WebElement select=Driver.getDriver().findElement(By.id("gh-cat"));
                Select categoryDropdown = new Select(select); // Adjust the selector for the category dropdown
                categoryDropdown.selectByVisibleText(category);
            }

            // Click the search button to perform the search

            sbe.clickSB.click();
            Driver.getDriver().navigate().to(url);
        }
    }
    @Then("I should see search results for each item")
    public void iShouldSeeSearchResultsForEachItem(DataTable dataTable) {
        // Convert the DataTable into a List of Maps
        List<Map<String, String>> criteriaList = dataTable.asMaps(String.class, String.class);

        // Loop through each search term and validate results
        for (Map<String, String> criteria : criteriaList) {
            String searchTerm = criteria.get("searchTerm");

            // Fetch all search result titles
            List<WebElement> results = Driver.getDriver().findElements(By.cssSelector(".s-item__title"));

            // Validate that at least one result contains the search term
            boolean isRelevant = results.stream().anyMatch(result -> result.getText().toLowerCase().contains(searchTerm.toLowerCase()));

            if (isRelevant) {
                System.out.println("Search results for '" + searchTerm + "' are displayed correctly.");
            } else {
                throw new AssertionError("Search results for '" + searchTerm + "' are not relevant or not displayed.");
            }
        }

        // Quit the driver after validation
        Driver.getDriver().quit();
    }

}
