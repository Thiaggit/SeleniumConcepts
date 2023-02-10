package selenium.advanced;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thiagarajan_Loganath\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		
		WebElement element1 = driver.findElement(By.xpath("//button[@id='j_idt88:new']"));
		String parentwindow = driver.getWindowHandle();
		element1.click();
		Set<String> element1Windows = driver.getWindowHandles();
		int noOfWindowselement1 = driver.getWindowHandles().size();
		if(noOfWindowselement1>=1) {
			System.out.println("New windows are open");
		}else {
			System.out.println("No new windows are open");
		}
		
		WebElement element2 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']"));
		String parentwindowelement2 = driver.getWindowHandle();
		element2.click();
		Set<String> element2Windows = driver.getWindowHandles();
		for (String string : element2Windows) {
			if(!parentwindowelement2.equals(string)) {
				driver.close();
			}
		} 
		
		WebElement element3 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']"));
		String parentwindowelement3 = driver.getWindowHandle();
		element3.click();
		Set<String> element3Windows = driver.getWindowHandles();
		int noOfWindowselement3 = driver.getWindowHandles().size();
		System.out.println("The number of opened windows are "+ noOfWindowselement3);
	}

}
