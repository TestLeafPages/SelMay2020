package week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnScreenShot {
	
	public static void takeScreenShot(WebElement element,String eleName) throws IOException {
		
		Date date = new Date();
		
		System.out.println();

		File source = element.getScreenshotAs(OutputType.FILE);
		
		//File source = driver.getScreenshotAs(OutputType.FILE);
		
		File target = new File("./snaps/"+eleName+".png");
		
		FileUtils.copyFile(source, target);

	}
	

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Window.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement openHomePage = driver.findElementById("home");
		
		takeScreenShot(openHomePage,"openHomePage");
		
		WebElement openMultipleWindow = driver.findElementByXPath("//button[text()='Open Multiple Windows']");
		
		takeScreenShot(openMultipleWindow,"openMultipleWindow");
		

	}

}
