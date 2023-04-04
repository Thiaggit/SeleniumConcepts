package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTableWithHeaderDef {
	WebDriver driver;
	
	@Given("user enters login page")
	public void user_enters_login_page() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@When("user the user enters the valid")
	public void user_the_user_enters_the_valid(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> creds = dataTable.asMaps(String.class, String.class);
		String uname = creds.get(0).get(Username);
		String pwd = creds.get(0).get(Password);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	}
	@When("user clicks on the submit button")
	public void user_clicks_on_the_submit_button() {
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	    login.click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}



}
