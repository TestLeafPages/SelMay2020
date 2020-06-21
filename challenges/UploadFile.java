package challenges;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {
	
	/*
	 * Properties prop = null;
	 * 
	 * @BeforeTest public void loadObject() throws FileNotFoundException,
	 * IOException { prop = new Properties(); prop.load(new FileInputStream(
	 * "C:\\Users\\sysd\\Desktop\\PatternObjectModel\\FRG.properties")); }
	 */
	@Test
	public void upload() throws MalformedURLException{
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
	//	driver.findElementByName("filename").sendKeys("C:\\Users\\hp\\Desktop\\Resume.docx");
		WebElement upload = driver.findElementById("file_upload");
		upload.sendKeys("C:\\Users\\hp\\Desktop\\Resume.docx");
		
		
		
		
		
		
		
	}
}