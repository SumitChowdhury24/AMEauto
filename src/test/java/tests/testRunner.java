package tests;

import org.testng.annotations.Test;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/features",
        glue = "stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        tags = "@run"
)

public class testRunner{
    @Test
    public void runCucumberTests() {
        // Runs the tests
    }
}
