package challenges;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementHighlight {
	
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get("http://jqueryui.com/");
		//driver.executeScript(script, args)
		WebElement checkIn =driver.findElementByLinkText("Demos");

		for (int i = 0; i < 20; i++) {
			//WebElement checkIn = driver.findElementByXPath("//img[@alt='Support the jQuery Foundation']");

			((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style', arguments[1]);", checkIn,
					"color: Yellow; border: 10px dotted solid green;");
			Thread.sleep(300);
			((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style', arguments[1]);", checkIn,
					"color: transparent;");
			Thread.sleep(300);
		}
	}
	}
