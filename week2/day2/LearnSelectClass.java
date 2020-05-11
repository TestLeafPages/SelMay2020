package week2.day2;

import java.util.List;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	//	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
	//	FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElementById("username");
			
		userName.sendKeys("demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
	//	driver.findElementByPartialLinkText("CRM").click();
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
	//	driver.findElementById("createLeadForm_dataSourceId").sendKeys("Conference");
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
				
		
		  Select dropDown = new Select(source);
		  
		  List<WebElement> options = dropDown.getOptions();
		  
		  
		  
		/*
		 * int size = options.size();
		 * 
		 * System.out.println(size);
		 */
		  
		/*
		 * for (WebElement eachElement : options) {
		 * 
		 * Thread.sleep(1000); eachElement.click();
		 * 
		 * }
		 */
		  
		 // List<WebElement> options = dropDown.getOptions();
		  
		/*
		 * dropDown.selectByVisibleText("Conference");
		 * 
		 * Thread.sleep(1000);
		 * 
		 * dropDown.selectByValue("LEAD_EMPLOYEE");
		 * 
		 * Thread.sleep(1000);
		 */
		 
		
		//dropDown.selectByIndex(3);
		
		
		
		
				
		/*
		 * Options manage = driver.manage();
		 * 
		 * Window window = manage.window();
		 * 
		 * window.maximize();
		 */
			
		
		//java wait
		Thread.sleep(4000);
		
		
		driver.close();
		

	}

}
