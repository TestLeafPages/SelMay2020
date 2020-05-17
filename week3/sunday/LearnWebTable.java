package week3.sunday;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/table.html");
		
		List<WebElement> rows = driver.findElementsByXPath("//table[@id='table_id']//tr");
		
		for (int i = 2; i <= rows.size(); i++) {
			
			
			List<WebElement> cells = driver.findElementsByXPath("//table[@id='table_id']//tr["+i+"]/td");
			
			for (int j = 1; j <= cells.size(); j++) {

				String text = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]").getText();
				
				System.out.print(text+" ");
			}

			System.out.println();
			
		}
		
		
	
	}

}
