package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utilities.webDriverSetup;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class hooks implements ITestListener{
    private ExtentReports extentReports;

    @BeforeSuite
    public void initializeExtentReport(){
        ExtentSparkReporter reporter = new ExtentSparkReporter("src/test/output/extent-report.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(reporter);
    }

    @AfterSuite
    public  void generateExtent(){
        extentReports.flush();
    }
}