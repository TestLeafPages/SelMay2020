package challenges;

import java.awt.AWTException;

import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	public static void main(String[] args) throws InterruptedException, AWTException {

		// chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// maximize the browser
		driver.manage().window().maximize();

		// load the browser with url
		driver.get("https://www.naukri.com/");
		

		int y = driver.findElementByLinkText("Create Job Alert")
				.getLocation().getY();
		
		//driver.executeScript(script, args)
		
		//Way1						  //x,y
		driver.executeScript("scroll(0,"+y+");");

		

		// Way 2
		/*Actions builder = new Actions(driver);
		builder.sendKeys(Keys.PAGE_DOWN).build().perform();	*/	

	}
}



