package FrameWork;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import page.objects.model.LandingPage;
import page.objects.model.LogInPage;
import utils.end.functions.reportout;
import utils.end.functions.screenshots;

public class DemoTest extends browserUtils {

	
	@BeforeTest
	public void beforeTestExcecution() throws IOException {
		
		
	}
	
	@Test(dataProvider = "getData")
	public void browserCheck(String username, String Password,String text) throws IOException, InterruptedException {
		driver=initialiseDriver();
		
		System.out.println(driver.getCurrentUrl());
		
		
		
		LandingPage land = new LandingPage(driver);
		//LogInPage logIn = new LogInPage(driver);
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)	;	
		land.logIn().click();
		
		LogInPage logIn = new LogInPage(driver);
		logIn.username().sendKeys(username);
//		
		logIn.password().sendKeys(Password);
//		
		logIn.loginButton().click();
//		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println(text);
//		screenshots.takeScreenShots(driver);
		
//		reportout.createReport("hello face book");
		//Thread.sleep(1000);
		driver.close();
//		driver.quit();
	}
	
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[2][3];
		data[0][0]="email";
		data[0][1]="password";
		data[0][2]="First Combination";
		
		data[1][0]="email1";
		data[1][1]="password1";
		data[1][2]="Second Combination";
		
		return data;
		
	}
	
//	@AfterTest
//	public void afterTestExecution() {
//		driver.close();
//		driver.quit();
//		
//	}
}
