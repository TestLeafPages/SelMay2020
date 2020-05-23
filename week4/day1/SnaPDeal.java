package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnaPDeal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications-");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		WebElement mensFashion = driver.findElementByXPath("(//span[contains(text(),'Men')])[2]");
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(mensFashion).perform();
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("(//span[text()='Shirts'])[2]").click();
		
		WebElement firstItem = driver.findElementByXPath("//span[contains(@id,'display-price')]");
		
		builder.moveToElement(firstItem).perform();
		
		driver.findElementByXPath("//div[contains(text(),'Quick View')]").click();
		
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
