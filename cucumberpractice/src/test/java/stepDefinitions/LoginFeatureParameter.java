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



public class LoginFeatureParameter {

	WebDriver driver;
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@When("user the user enters the valid {string} and {string}")
	public void user_the_user_enters_the_valid_and(String uname, String pwd) {
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	}
	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
	    WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	    login.click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Then("user should see the home page")
	public void user_should_see_the_home_page() {
//	    boolean status = driver.findElement(By.xpath("//div[@class='oxd-brand-logo']")).isDisplayed();
//	    Assert.assertTrue(status);
	    String expectedTitle = "OrangeHRM";
	    String title = driver.getTitle();
	    if(title.equals(expectedTitle)) {
	    	System.out.println("The page is loaded");
	    }
	}
	



}
