package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMultipleElemets {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElementById("username");
		
		
		
		//List<WebElement> input = driver.findElementsByClassName("inputLogin");
	
		
		
	//	System.out.println(input.get(0).getAttribute("name"));
		
		/*
		 * for (WebElement eachElement : input) {
		 * 
		 * System.out.println(eachElement.getAttribute("name"));
		 * 
		 * }
		 */
		
		
		/*
		 * List<WebElement> link = driver.findElementsByTagName("a");
		 * 
		 * // System.out.println(link.size());
		 * 
		 * 
		 * for (WebElement eachElement : link) {
		 * 
		 * String text = eachElement.getText(); System.out.println(text);
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 */
		

	}

}
