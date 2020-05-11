package week2.day2;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnVerification {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	//	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
	//	FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		//step1
	//	WebElement month = driver.findElementById("month");
		
		
		//create object for Select class
		
		Select dd = new Select(driver.findElementById("month"));
		
		//select value using selectBy*
		
		//dd.selectByVisibleText("Feb");
		
	//	dd.selectByValue("2");
		
	//	dd.selectByIndex(0);
		
		List<WebElement> months = dd.getOptions();
		
		for (WebElement eachMonth : months) {
			
		//	System.out.println(eachMonth.getText());
		System.out.println(eachMonth.getAttribute("value"));
			
		}
		
		
		/*
		 * System.out.println(months.size());
		 * 
		 * int size = months.size();
		 * 
		 * dd.selectByIndex(size-1);
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
