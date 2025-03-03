package UI.Ebay.Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/Features",
        glue = "UI/Ebay/StepDefinitions", // Ensure this matches your step definitions package
        tags= "@smoke" ,
        dryRun = true,
        publish = true,
        plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber-report.json", "rerun:target/rerun.txt"  }

)
public class SmokeRunner {
}
