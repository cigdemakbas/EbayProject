package UI.Ebay.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/Features",
        glue = "UI/Ebay/StepDefinitions", // Ensure this matches your step definitions package
        tags = "not @Skip",
        dryRun = true,
        plugin = {"pretty",
                "html:target/cucumber.html",
                "junit:target/cucumberJunit.xml",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt" },
        publish = true

)
class Runner {
}