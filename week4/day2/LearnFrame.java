package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://dev60453.service-now.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		  driver.switchTo().frame("gsft");
		  
		  driver.findElementById("user_name").sendKeys("admin");
		  
		  driver.findElementById("user_password").sendKeys("India@123");
		  
		  driver.findElementById("sysverb_login").click();
		 
		
		/*
		 * driver.switchTo().frame(1);
		 * 
		 * driver.switchTo().frame(0);
		 * 
		 * driver.findElementById("Click1").click();
		 * 
		 * 
		 * 
		 * driver.switchTo().defaultContent();
		 * 
		 * String text = driver.findElementByTagName("h1").getText();
		 * 
		 * System.out.println(text);
		 */
		  
		/*
		 * driver.switchTo().parentFrame();
		 * 
		 * driver.switchTo().parentFrame();
		 * 
		 * driver.switchTo().parentFrame();
		 */
		  
		
		 
		
	//	WebElement frame = driver.findElementByXPath("//iframe[@title='Main Content']");
		
		/*
		 * driver.switchTo().frame(frame);
		 * 
		 * driver.findElementById("user_name").sendKeys("admin");
		 * 
		 * driver.findElementById("user_password").sendKeys("India@123");
		 * 
		 * driver.findElementById("sysverb_login").click();
		 */
		
		
		
		
		
		
		
		
		

	}

}
