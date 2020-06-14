package week7.day2;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LeaarnExtentReport {

	public static void main(String[] args) throws IOException {
		
		// Execution
		//To create a html report
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./extentReport/result.html");
		
		reporter.setAppendExisting(true);
		
		// To design the report
		ExtentReports extent = new ExtentReports();
		
		
		// to attach the design with physical report
		extent.attachReporter(reporter);
		
		
		//Testcase level
		ExtentTest test = extent.createTest("LoginLogout", "Positive testcase for Login functionality");
		test.assignAuthor("Hari");
		test.assignCategory("Functional");
		
		
		
		//Step level
		test.pass("username is entered successfully",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/sample.png").build());
		test.pass("password is entered successfully");
		test.fail("login button not clicked successfully");
		
		
		
		extent.flush();
		
		
		
		
		
		
		
		
		

	}

}
