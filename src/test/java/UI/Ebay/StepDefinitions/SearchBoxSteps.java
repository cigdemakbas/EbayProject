package UI.Ebay.StepDefinitions;

import UI.Ebay.TestBase;
import UI.Ebay.Utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchBoxSteps extends TestBase {

    String url = ConfigReader.getProperty("url");

    @Given("Go to the home page")
    public void goToTheHomePage() {

getAppLibrary().getFlowsLibrary().navigateToUrl(url);
    }

    @When("click searchBox and write")
    public void clickSearchBoxAndWrite() {

        getAppLibrary().getPage().getSbp().clickSearchBoxAndWrite();
    }

    @And("I click the search button")
    public void iClickTheSearchButton() {
        getAppLibrary().getPage().getSbp().iClickTheSearchButton();
    }

    @Then("User should see the results")
    public void userShouldSeeTheResults() {
        getAppLibrary().getPage().getSbp().userShouldSeeTheResults();

    }

    @Then("I should see a message")
    public void iShouldSeeAMessage() {
        getAppLibrary().getPage().getSbp().iShouldSeeAMessage();
    }

    @When("I enter searchBox")
    public void iEnterInValidProductOnSearchBox() {
       getAppLibrary().getPage().getSbp().iEnterInValidProductOnSearchBox();
    }

    @And("enter invalid product")
    public void enterInvalidProduct() {
        getAppLibrary().getPage().getSbp().enterInvalidProduct();
    }
}