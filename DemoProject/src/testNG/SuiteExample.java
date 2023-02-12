package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {

	WebDriver driver; //The driver declared outside so all the methods can use it
	//To open browser and navigate to google, yahoo and bing
	
	//This annotation is used to perform ops before all the tests executes
	@BeforeSuite
	public void LaunchBrowser() {		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thiagarajan_Loganath\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test(priority=0)
	public void OpenGoogle() {
		driver.get("https://google.co.in");
	}
	
	@Test(priority=1)
	public void OpenBing() {
		driver.get("https://bing.co.in");
	}
	
	@Test(priority=2)
	public void OpenYahoo() {
		driver.get("https://yahoo.co.in");
	}
	
	//This annotation is used to execute  code which needs to be done after all the test cases
	@AfterSuite
	public void CloseBrowser() {
		driver.quit();
	}
}
