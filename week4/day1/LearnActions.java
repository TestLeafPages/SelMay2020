package week4.day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		 WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		 WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
		
		//WebElement source = driver.findElementById("draggable");
		
	//	WebElement target = driver.findElementById("droppable");
		
		 Actions builder = new Actions(driver);
		 
		 builder.keyDown(Keys.SHIFT).click(item1).clickAndHold().moveToElement(item4).release().perform();
		 
	//	 builder.dragAndDropBy(source, 100, 100).perform();
		 
		// builder.dragAndDrop(source, target).perform();
		
		/*
		 * WebElement dhotis = driver.findElementByXPath("//a[text()='Dhotis']");
		 * 
		 * Actions builder = new Actions(driver); builder.click(dhotis).perform();
		 */
		//WebElement user = driver.findElementByXPath("//label[text()='Username']");
		
	//	WebElement user = driver.findElementById("username");
		
	//	user.sendKeys("demosalesmanager");
		
		
		/*
		 * Actions builder = new Actions(driver);
		 * 
		 * builder.sendKeys(user, "demosalesmanager").perform();
		 */
		 
	
		 
		/*
		 * Point location = item4.getLocation(); location.getX(); location.getY();
		 */
		
		
		
		
		/*
		 * //get into a frame driver.switchTo().frame(0);
		 * 
		 * WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		 * WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		 * WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
		 * 
		 * Actions builder = new Actions(driver);
		 * 
		 * // builder.keyDown(Keys.CONTROL).click(item1)
		 * builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).keyUp(
		 * Keys.CONTROL).perform();
		 */
		
		
		
		/*
		 * WebElement men = driver.findElementByXPath("//a[text()='Men']");
		 * 
		 * Actions builder = new Actions(driver);
		 * 
		 * builder.moveToElement(men).perform();
		 * 
		 * driver.findElementByXPath("//a[text()='Jeans']").click();
		 */
		
		
		
		
		
		
		
		
		
		/*
		 * Actions builder = new Actions(driver);
		 * 
		 * builder.moveToElement(men).perform();
		 */
		
	
		

	}

}
