package challenges;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertSnap {
	int i=1;
	@Test
	public void alertSnap() throws IOException, AWTException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByLinkText("AGENT LOGIN").click();
		driver.findElementById("loginbutton").click();		
		takeSnap();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();


	}
	public void takeSnap() throws IOException, HeadlessException, AWTException {		
		//Screen Size
		Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec = new Rectangle(dimen);
		//Write File
		BufferedImage img = new Robot().createScreenCapture(rec);		
		ImageIO.write(img, "jpg", new File("./snaps/"+i+".jpg"));
		i++;
	}
	

}
