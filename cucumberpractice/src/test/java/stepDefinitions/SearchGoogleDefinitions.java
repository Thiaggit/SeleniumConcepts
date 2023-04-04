package stepDefinitions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;



public class SearchGoogleDefinitions {

	WebDriver driver;
	
	@Given("user is entering google website")
	public void user_is_entering_google_website() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Thiagarajan_Loganath\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		driver.get("https://www.google.co.in");
	}
	@When("user is typing the search tesrm {string}")
	public void user_is_typing_the_search_tesrm(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(string);
	}
	@When("when user presses the enter key")
	public void when_user_presses_the_enter_key() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	@Then("user should see the results")
	public void user_should_see_the_results() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.partialLinkText("Apple")).isDisplayed();
	}



}
