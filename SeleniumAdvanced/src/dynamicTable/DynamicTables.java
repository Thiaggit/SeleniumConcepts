package dynamicTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTables {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Thiagarajan_Loganath\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/selenium-webdriver/handle-dynamic-webtables-in-selenium-webdriver/");
		
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int noOfColumns = columns.size();
		System.out.println("The number of columns are " + noOfColumns);
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int noOfRows = rows.size();
		System.out.println("The number of rows are " + noOfRows);
		
		driver.quit();
	}

}
