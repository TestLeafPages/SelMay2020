package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnAlerts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		
		
		

		driver.get("http://leafground.com/pages/Alert.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//driver.findElementByXPath("//button[text()='Alert Box']").click();
		
		

		/*
		 * driver.findElementByXPath("//button[text()='Confirm Box']").click();
		 * Thread.sleep(2000); Alert alert = driver.switchTo().alert();
		 * 
		 * System.out.println(alert.getText()); alert.dismiss();
		 */
		/*
		 * driver.findElementByXPath("//button[text()='Prompt Box']").click();
		 * 
		 * Alert alert = driver.switchTo().alert();
		 * 
		 * alert.sendKeys("TL"); Thread.sleep(3000); alert.accept();
		 */
		
		driver.findElementById("btn").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//button[text()='OK']").click();
		
		
		/*
		 * TargetLocator switchTo = driver.switchTo();
		 * 
		 * Alert alert = switchTo.alert();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * alert.accept();
		 * 
		 * 
		 * String text = alert.getText();
		 * 
		 * System.out.println(text);
		 */

		// driver.findElementByXPath("//button[text()='Confirm Box']").click();

	}

}
