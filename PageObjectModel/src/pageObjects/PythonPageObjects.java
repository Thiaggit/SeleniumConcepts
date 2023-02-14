package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PythonPageObjects {
	
	//We can design object repository by below two ways. The most preferred and industry standard is to use @FindBy 
	//annotation in PageFactory class
	
	//Famous Interview Question - Can we identify webelements witthout using findElement?
	//Ans: Yes, we can identify using @FindBy annotation in PageFactory class
		
		@FindBy(name = "name")
		public static WebElement Name;
		
		@FindBy(name = "email")
		public static WebElement Email;
		
		@FindBy(name = "telephone")
		public static WebElement Telephone;
		
		@FindBy(xpath = "//a[contains(text(),'Submit')]")
		public static WebElement Submit;
		
		@FindBy(xpath = "//span[contains(text(), 'PYTHON')]")
		public static WebElement Python;
		

//	public static WebElement Name(WebDriver driver) {
//		return driver.findElement(By.name("name"));
//	}
//	
//    public static WebElement Email(WebDriver driver) {
//    	return driver.findElement(By.name("email"));
//	}
//
//    public static WebElement Telephone(WebDriver driver) {
//    	return driver.findElement(By.name("telephone"));
//    }
//
//    public static WebElement Submit(WebDriver driver) {
//    	return driver.findElement(By.xpath("//a[contains(text(),'Submit')]"));
//    }
//    
//    public static WebElement Python(WebDriver driver) {
//    	return driver.findElement(By.xpath("//span[contains(text(), 'PYTHON')]"));
//    }
    
}
