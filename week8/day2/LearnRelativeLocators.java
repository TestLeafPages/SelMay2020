package week8.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LearnRelativeLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
			
		driver.get("http://leaftaps.com/opentaps/control/main");
			
		driver.manage().window().maximize();
		
		WebElement userLabel = driver.findElementByXPath("//label[text()='Username']");
		
		driver.findElement(RelativeLocator.withTagName("input").toRightOf(userLabel)).sendKeys("demosalesmanager");
		
		WebElement username = driver.findElementById("username");
	//	username.sendKeys("demosalesmanager");
		
		driver.findElement(RelativeLocator.withTagName("input").near(username,250)).sendKeys("crmsfa");
		
	//	50 pixel
		
		//below
		//above
		//toLeftOf
		//toRightOf
		//near

	}

}
