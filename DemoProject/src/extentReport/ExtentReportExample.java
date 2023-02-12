package extentReport;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;
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
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportExample {

	WebDriver driver; 
	ExtentReports extentReport;
	ExtentSparkReporter spark;
	ExtentHtmlReporter htmlReporter;
	ExtentTest testcase;
	
	@Test(priority=0)
	public void OpenGoogle() throws IOException {
		testcase = extentReport.createTest("Verify Google");
		driver.get("https://google.co.in");
		String title = driver.getTitle();
		if(title.equals("Google")) {
			testcase.log(Status.PASS, "ACtual title and Expected are same");
		}else {
			testcase.log(Status.FAIL, "Actual and Expected title are not same");
			TakesScreenshot scr = (TakesScreenshot) driver;
			File sourceFile = scr.getScreenshotAs(OutputType.FILE);
			File destinationFile = new File("google.png");
			FileHandler.copy(sourceFile, destinationFile);
		}
	}
	
	@Test(priority=1)
	public void OpenBing() throws IOException {
		testcase = extentReport.createTest("Verify Bing");
		driver.get("https://bing.co.in");
		String title = driver.getTitle();
		if(title.equals("Bing")) {
			testcase.log(Status.PASS, "ACtual title and Expected are same");
		}else {
			testcase.log(Status.FAIL, "Actual and Expected title are not same");
			TakesScreenshot scr = (TakesScreenshot) driver;
			File sourceFile = scr.getScreenshotAs(OutputType.FILE);
			File destinationFile = new File("google.png");
			FileHandler.copy(sourceFile, destinationFile);
		}
	}
	
	@Test(priority=2)
	public void OpenYahoo() throws IOException {
		testcase = extentReport.createTest("Verify Yahoo");
		driver.get("https://yahoo.co.in");
		String title = driver.getTitle();
		if(title.equals("Yahoo")) {
			testcase.log(Status.PASS, "ACtual title and Expected are same");
		}else {
			testcase.log(Status.FAIL, "Actual and Expected title are not same");
			TakesScreenshot scr = (TakesScreenshot) driver;
			File sourceFile = scr.getScreenshotAs(OutputType.FILE);
			File destinationFile = new File("google.png");
			FileHandler.copy(sourceFile, destinationFile);
		}
	}
	
	@BeforeSuite
	public void LaunchBrowser() {	
		extentReport = new ExtentReports();
		spark = new ExtentSparkReporter("Spark.html");
		extentReport.attachReporter(spark);	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thiagarajan_Loganath\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	//This annotation is used to execute  code which needs to be done after all the test cases
	@AfterSuite
	public void CloseBrowser() {
		
		driver.quit();
		extentReport.flush();
	}
}
