package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utilities.webDriverSetup;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class hooks implements ITestListener{
    private ExtentReports extentReports;
    private ExtentTest extentTest;

    @Override
    public void onStart(ITestContext context) {
        // Setup for Extent Report
        ExtentSparkReporter reporter = new ExtentSparkReporter("test-output/extent-report.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(reporter);
    }

    @Override
    public void onTestStart(ITestResult result) {
        extentTest = extentReports.createTest(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        extentTest.pass(result.getName() + " passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        extentTest.fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        extentTest.skip(result.getName() + " skipped");
    }

   /* @Override
    public void onFinish(ITestContext context) {
        extentReports.flush();
    }*/

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}
/*
    @Override
    public void onStart(ITestContext context) {}*/

}
