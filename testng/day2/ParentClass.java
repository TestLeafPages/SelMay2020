package testng.day2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ParentClass {
	public ChromeDriver driver;
	
	public String workBookName;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void login(String url, String username, String password) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(username);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();

	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();

	}
	
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		
		
		return ReadExcel.readData(workBookName);
	

	}

}
