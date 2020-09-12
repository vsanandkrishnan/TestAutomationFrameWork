package utils.end.functions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class reportout {

	public  ExtentReports report;

	public  void createReport(String testName) {

		ExtentSparkReporter spark = new ExtentSparkReporter("report//index.html");
		spark.config().setReportName("Web Apllication Testing");
		spark.config().setDocumentTitle("Automation Test Results");

		report = new ExtentReports();
		report.attachReporter(spark);

		report.setSystemInfo("Tester", "Anandkrishnan");
		
		report.createTest(testName);
		
		report.flush();

	}

}
