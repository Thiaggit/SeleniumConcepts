package dataDrivenTesting;

import org.testng.annotations.Test;
import org.openqa.selenium.devtools.DevToolsException;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class ParameterExampleDDT {
	
	WebDriver driver;
	
  @Test
  @Parameters({"userName1", "passWord1"})
  public void CorrectUsername(String uName, String pwd) {
	  
	  WebElement userName = driver.findElement(By.name("username"));
	  userName.sendKeys(uName);
	  
	  WebElement passWord = driver.findElement(By.name("password"));
	  passWord.sendKeys(pwd);
	  
	  WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	  login.click();
  }
  
  @Test
  @Parameters({"userName2", "passWord2"})
  public void CorrectPassword(String uName, String pwd) {
	  
	  WebElement userName = driver.findElement(By.name("username"));
	  userName.sendKeys(uName);
	  
	  WebElement passWord = driver.findElement(By.name("password"));
	  passWord.sendKeys(pwd);
	  
	  WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	  login.click();
  }
  
  @Test
  @Parameters({"userName3", "passWord3"})
  public void WrongUsernameWrongPassword(String uName, String pwd) {
	  
	  WebElement userName = driver.findElement(By.name("username"));
	  userName.sendKeys(uName);
	  
	  WebElement passWord = driver.findElement(By.name("password"));
	  passWord.sendKeys(pwd);
	  
	  WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	  login.click();
  }
  
  @Test
  @Parameters({"userName4", "passWord4"})
  public void BothCorrect(String uName, String pwd) {
	  
	  WebElement userName = driver.findElement(By.name("username"));
	  userName.sendKeys(uName);
	  
	  WebElement passWord = driver.findElement(By.name("password"));
	  passWord.sendKeys(pwd);
	  
	  WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	  login.click();
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\Thiagarajan_Loganath\\Project\\EdgeDriver\\edgedriver_win64\\msedgedriver.exe");
	  driver=new EdgeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
  }

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}
