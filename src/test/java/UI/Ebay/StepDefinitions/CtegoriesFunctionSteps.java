package UI.Ebay.StepDefinitions;

import UI.Ebay.Elements.SearchBoxElements;
import UI.Ebay.Utilities.Driver;
import UI.Ebay.Utilities.Utility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CtegoriesFunctionSteps extends SearchBoxElements {
    SearchBoxElements sbe= new SearchBoxElements();
    @When("Click the categories section")
    public void clickTheCategoriesSection() {
        WebElement categories= Driver.getDriver().findElement(By.id("gh-cat"));
        categories.click();
    }
    @And("User should click and navigate every category")
    public void userShouldClickAndNavigateEveryCategory(DataTable dt) throws InterruptedException {
        WebElement categories = Driver.getDriver().findElement(By.id("gh-cat"));
        Select list = new Select(categories);
        List<WebElement> categoriesList = list.getOptions();
        List<String> myList = dt.asList();
        System.out.println("This comes from table : "+myList);
        System.out.println("This comes from select class"+categoriesList);

        for (int i = 0; i < categoriesList.size(); i++) {
            String dropdownText = categoriesList.get(i).getText();
//            list.selectByVisibleText(dropdownText);
//            String expectedText = myList.get(i);
            Assert.assertEquals(expectedText,dropdownText);
        }

    }

    @Then("Verify that user should be navigated to the correct page for each category")
    public void verifyThatUserShouldBeNavigatedToTheCorrectPageForEachCategory() {
    }
}
