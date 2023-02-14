package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;

public class LoginTestCases {
	WebDriver driver;
	
  @Test
  public void LoginTestcase() {
	  
	  PageFactory.initElements(driver, LoginPageObjects.class);
	   
	  LoginPageObjects.Name.sendKeys("xyz");
	  LoginPageObjects.Email.sendKeys("xyz@xyz.com");
	  LoginPageObjects.Telephone.sendKeys("telephone");
	  LoginPageObjects.Submit.click();
	  
//	  LoginPageObjects.Name(driver).sendKeys("xyz");
//	  LoginPageObjects.Email(driver).sendKeys("xyz@xyz.com");
//	  LoginPageObjects.Telephone(driver).sendKeys("telephone");
//	  LoginPageObjects.Submit(driver).click();
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
