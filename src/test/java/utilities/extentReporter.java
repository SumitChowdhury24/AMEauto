package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class extentReporter {
    private static ExtentReports extent;
    private static ExtentTest test;
    private static ExtentSparkReporter htmlReporter;

    // Set up the ExtentReports object
    @Before
    public static void initializeExtentReport() {
        htmlReporter = new ExtentSparkReporter("src/test/output/ExtentReports.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        startTest("TestRun");
    }

    public static void logStep(String stepDescription) {
        test.info(stepDescription);
    }
    public static void logFailure(String stepDescription){
        test.fail(stepDescription);
    }

    public static void logPass(String stepDescription){
        test.pass(stepDescription);
    }

    @After
    public static void tearDown() {
        extent.flush();
    }

    public static void startTest(String testName) {
        test = extent.createTest(testName);
    }

}
