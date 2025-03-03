package UI.Ebay.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/Features", // html:target/default-cucumber-reports.html
        glue = "UI/Ebay/StepDefinitions", // Ensure this matches your step definitions package
        tags= "@regression" ,
        dryRun = true,
        publish = true,
        plugin = {"pretty","html:target/default-cucumber-reports.html","json:target/cucumber-report.json", "rerun:target/rerun.txt"  }

)
public class RegressionRunner {

}
