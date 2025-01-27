package UI.Ebay.Utilities;

import UI.Ebay.Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.time.Duration;

public class Hook {
    @Before

    public void setup(Scenario scenario)  {
        System.out.println("Starting scenario: " + scenario.getName());
        System.out.println("Tags: " + scenario.getSourceTagNames());
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Apply implicit wait
        File reportFile = new File("target/cucumber-reports.html");
        if (reportFile.exists()) {
            reportFile.deleteOnExit();
            System.out.println("Old report deleted.");
        }
    }

    @After
    public void tearDown(Scenario scenario) throws InterruptedException {
        if (scenario.isFailed()) {
            System.out.println("Test Failed: " + scenario.getName());
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/jpeg", "Failed Test Screenshot");
        } else {
            System.out.println("Clean Up started for: " + scenario.getName());
        }
        System.out.println("Ending scenario: " + scenario.getName());
        Driver.getDriver().close(); // Ensure proper cleanup between scenarios

    }

}
