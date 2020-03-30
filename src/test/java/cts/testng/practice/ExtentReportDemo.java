
	
package cts.testng.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class ExtentReportDemo {
@Test
public void loginTest() {

Assert.assertEquals("loginsucess", "loginsucess");

ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./Report1/extent.html");

ExtentReports extent = new ExtentReports();
extent.attachReporter(htmlReporter);

ExtentTest logger = extent.createTest("loginTest", "Description");

logger.log(Status.INFO, "Login to facebook");

logger.log(Status.PASS, "loginsucess");

extent.flush();


}
}