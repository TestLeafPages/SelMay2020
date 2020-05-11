package week2.day2;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	//	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
	//	FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		String text = driver.findElementByXPath("//h2").getText();
			
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
