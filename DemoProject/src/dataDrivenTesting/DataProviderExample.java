package dataDrivenTesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class DataProviderExample {
	WebDriver driver;
	String[][] data = {{"Thiagu","Chennai"},
			           {"Dhinesh","Coimbatore"},
			           {"John","NewYork"},
			           {"Adam","Austin"},
	                  };
	
	@DataProvider(name="Entry")
	public String[][] DataEntry(){
		return data;
	}
	
  @Test(dataProvider = "Entry" )
  public void EnteringDetails(String empname, String empcity) {
	  WebElement name = driver.findElement(By.xpath("//input[@id='j_idt88:name']"));
	  name.sendKeys(empname);
	  
	  WebElement city = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']"));
	  city.sendKeys(empcity);
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thiagarajan_Loganath\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://leafground.com/input.xhtml");
  }

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}
