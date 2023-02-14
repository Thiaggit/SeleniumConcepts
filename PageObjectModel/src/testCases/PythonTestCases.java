package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import pageObjects.PythonPageObjects;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;

public class PythonTestCases {
	
	WebDriver driver;
	
	
  @Test
  public void PythonEnrollment() {
	  
	  PageFactory.initElements(driver, PythonPageObjects.class);
	  
	  PythonPageObjects.Python.click();
	  PythonPageObjects.Name.sendKeys("xyz");
	  PythonPageObjects.Email.sendKeys("xyz@xyz.com");
	  PythonPageObjects.Telephone.sendKeys("telephone");
	  PythonPageObjects.Submit.click();
	  
//	  PythonPageObjects.Python(driver).click();
//	  PythonPageObjects.Name(driver).sendKeys("xyz");
//	  PythonPageObjects.Email(driver).sendKeys("xyz@xyz.com");
//	  PythonPageObjects.Telephone(driver).sendKeys("telephone");
//	  PythonPageObjects.Submit(driver).click();
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Thiagarajan_Loganath\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.seleniumframework.com/Practiceform/");
  }

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}
