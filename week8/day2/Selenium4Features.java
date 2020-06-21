package week8.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium4Features {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		
		options.setHeadless(true);
		options.addArguments("--incognito");
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		
		driver.get("https://www.amazon.in/");
		
		System.out.println(driver.getTitle());
		
		/*
		 * driver.switchTo().newWindow(WindowType.TAB).get("https://www.facebook.com/");
		 * 
		 * System.out.println(driver.getTitle());
		 * 
		 * //index 0 - amazon ; index 1 - facebook
		 * 
		 * Set<String> setWin = driver.getWindowHandles();
		 * 
		 * List<String> listWin = new ArrayList<String>(setWin);
		 * 
		 * driver.switchTo().window(listWin.get(0));
		 * 
		 * System.out.println(driver.getTitle());
		 */
		
		//driver.get("https://www.facebook.com/");
			
		
		/*
		 * Thread.sleep(2000);
		 * 
		 * driver.manage().window().minimize();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * driver.manage().window().fullscreen();
		 */
		
	}

}
