package week4.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/TextChange.html");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//WebElement men = driver.findElementByXPath("//a[text()='Men']");
		
		/*Actions builder = new Actions(driver);
		
		builder.moveToElement(men).perform();*/
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(ElementNotInteractableException.class);
		
		//  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		  
		  wait.until(ExpectedConditions.textToBe(By.id("btn"), "Click Me!"));
		 
		driver.findElementById("btn").click();
		/*
		 * driver.findElementById("username").sendKeys("demosalesmanager");
		 * 
		 * 
		 * 
		 * 
		 * driver.findElementById("password42342").sendKeys("crmsfa");
		 */
		
		
	}

}
