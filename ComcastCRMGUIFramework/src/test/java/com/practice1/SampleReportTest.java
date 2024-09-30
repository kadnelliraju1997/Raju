package com.practice1;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReportTest {
	public ExtentReports report;
	@BeforeSuite
	public void configER() {
		
		// spark report config
				ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReport/report.html");
				spark.config().setDocumentTitle("CRM Test Suite");
				spark.config().setReportName("Results");
				spark.config().setTheme(Theme.DARK);
				
				//Add env information and create Test
				report=new ExtentReports();
				report.attachReporter(spark);
				report.setSystemInfo("OS", "Window-11");
				report.setSystemInfo("Browser", "Chrome-128");
	}
	@AfterSuite
	public void configERBackUp() {
		report.flush();
	}

	@Test
	public void createContacTest()
	{
		
		
		ExtentTest test=report.createTest("createContactTest");
		test.log(Status.INFO,"login to app");
		test.log(Status.INFO,"navigate to app ");
		test.log(Status.INFO,"create contact");
		
		if("HDFC".equals("HDFC")) {
			test.log(Status.PASS, "contact is created");
		}else {
			test.log(Status.FAIL, "contact not is created");

		}
		

	}
	
	
		@Test
		public void createContactTest() {
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.amazon.in");
			
			TakesScreenshot edriver=(TakesScreenshot)driver;
			String filePath = edriver.getScreenshotAs(OutputType.BASE64);
			
			ExtentTest test= report.createTest("createContactTest");
			
			test.log(Status.INFO, "login to app");
			test.log(Status.INFO, "navigate to Contact page");
			test.log(Status.INFO, "create contact");
			if("hdfc".equals("hdfcc")) {
				test.log(Status.PASS,"contact is created");
			}else {
				test.addScreenCaptureFromBase64String(filePath,"ErrorFile");
			}
			
			driver.close();
			
		}
		
		
		

	}


