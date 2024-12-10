package UI.Ebay.StepDefinitions;

import UI.Ebay.Elements.FooterEbayAboutElements;
import UI.Ebay.TestBase;
import UI.Ebay.Utilities.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FooterEbayAboutSteps extends TestBase {
    @When("I scroll to the footer section")
    public void iScrollToTheFooterSection() {
     getAppLibrary().getPage().getFep().iScrollToTheFooterSection();
    }

    @When("I click on the link")
    public void iClickOnTheLink() {
        getAppLibrary().getPage().getFep().iClickOnTheLink();
    }

    @Then("I should be navigated to the About eBay page")
    public void iShouldBeNavigatedToThePage() {
        getAppLibrary().getPage().getFep().iShouldBeNavigatedToThePage();
    }
}
