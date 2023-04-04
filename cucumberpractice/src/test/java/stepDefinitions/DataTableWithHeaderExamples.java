package stepDefinitions;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;



public class DataTableWithHeaderExamples {

	WebDriver driver;
	
	@Given("user enters into login page of Orange HRM")
	public void user_enters_into_login_page_of_Orange_HRM() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@When("user the user enters the username and password of {string} and {string}")
	public void user_the_user_enters_the_username_and_password(String uname, String pwd) {
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	}
	@Then("user going to click on the login button")
	public void user_going_to_click_on_the_login_button() {
	    WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	    login.click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	}
	



}
