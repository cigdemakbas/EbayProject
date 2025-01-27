package DataBaseTesting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/JDBC",
        glue = "DataBaseTesting/StepDefJDBC", // Ensure this matches your step definitions package
        tags = "databasetesting"
)
public class JDBCRUnner {
}
