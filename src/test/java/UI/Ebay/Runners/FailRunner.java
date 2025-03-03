package UI.Ebay.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)

            @CucumberOptions(
                    features = "@target/rerun.txt", // Path to the rerun file
                    glue = "stepDefinitions",
                    dryRun = true,
                    publish = true,
                    plugin = {
                            "pretty",
                            "html:target/fail-cucumber-reports.html",
                            "json:target/fail-cucumber.json"
                    },
                    monochrome = true

    )
    public class FailRunner {
    }

