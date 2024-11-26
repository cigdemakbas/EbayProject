package org.example;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        String arg0 = "Soap";
        Thread.sleep(2000);
        searchBox.sendKeys(arg0);
        Thread.sleep(2000);
        WebElement clickSB = driver.findElement(By.id("gh-btn"));
        clickSB.click();
        Thread.sleep(2000);
//        WebElement el= driver.findElement(By.xpath("//span[@class='gh-my-ebay__link gh-rvi-menu']"));
//el.click();
        String expectedTitle = "Soap for sale | eBay";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println(expectedTitle);
        System.out.println(actualTitle);
        System.out.println("aaaaaaaa");


        Thread.sleep(3000);
        driver.close();
    }
//    public static void myTestMethod(DataTable dt){
//        List<Map<String, String>> criteriaList = dt.asMaps();
//
//        for (Map<String, String> criteria : criteriaList) {
//            String searchTerm = criteria.get("searchTerm");
//            String category = criteria.get("category");
//
//            // Input search term
//            WebElement searchBox = Driver.getDriver().findElement(By.id("gh-ac"));
//            searchBox.clear();
//            searchBox.sendKeys(searchTerm);
//
//            // Select category
//            WebElement categoryDropdown = Driver.getDriver().findElement(By.id("gh-cat"));
//            categoryDropdown.sendKeys(category);
//
//            // Click search
//            WebElement searchButton = Driver.getDriver().findElement(By.id("gh-btn"));
//            searchButton.click();
//
//            // Validate results
//            List<WebElement> results = Driver.getDriver().findElements(By.cssSelector(".s-item__title"));
//            boolean isRelevant = results.stream().anyMatch(result -> result.getText().toLowerCase().contains(searchTerm.toLowerCase()));
//
//            if (isRelevant) {
//                System.out.println("Search results for '" + searchTerm + "' in '" + category + "' are displayed correctly.");
//            } else {
//                System.out.println("Search results for '" + searchTerm + "' in '" + category + "' are not relevant.");
//            }
//
//            // Go back to the homepage for the next iteration
//
//        }
//    }
//    @Then("I should see search results for each item")
//    public void iShouldSeeSearchResultsForEachItem(DataTable dataTable) {
//        // Convert the DataTable into a List of Maps
//        List<Map<String, String>> criteriaList = dataTable.asMaps(String.class, String.class);
//
//        // Loop through each search term and validate results
//        for (Map<String, String> criteria : criteriaList) {
//            String searchTerm = criteria.get("searchTerm");
//
//            // Fetch all search result titles
//            List<WebElement> results = Driver.getDriver().findElements(By.cssSelector(".s-item__title"));
//
//            // Validate that at least one result contains the search term
//            boolean isRelevant = results.stream().anyMatch(result -> result.getText().toLowerCase().contains(searchTerm.toLowerCase()));
//
//            if (isRelevant) {
//                System.out.println("Search results for '" + searchTerm + "' are displayed correctly.");
//            } else {
//                throw new AssertionError("Search results for '" + searchTerm + "' are not relevant or not displayed.");
//            }
//        }
//
//        // Quit the driver after validation
//        Driver.getDriver().quit();
//    }

}
