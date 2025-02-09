package stepDefinitions;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import utilities.extentReporter;

@CucumberOptions(
        features = "src/test/features",
        glue = "stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)

public class testRunner extends AbstractTestNGCucumberTests {
    @BeforeClass
    public static void beforeClass() {
        // Initialize ExtentReports
        extentReporter.initializeExtentReport();
    }

    @AfterClass
    public static void afterClass() {
        // After all tests, flush the report
        extentReporter.tearDown();
    }

    @Test
    public void runCucumberTests() {
        // Create a test log entry for ExtentReport
        //extentReporter.startTest("Started Cucumber Test Execution");
    }

}
