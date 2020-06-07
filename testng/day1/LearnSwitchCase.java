package testng.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LearnSwitchCase {

	RemoteWebDriver driver;

	public void openBrowser(String browser) {

		switch (browser) {

		case "chrome":
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		case "firefox":
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}
		case "edge":
			System.out.println("edge is opened");
			break;
		case "ie":
			System.out.println("ie is opened");
			break;
		default:
			System.out.println("safari is opened");

		}

		/*
		 * if (browser.equals("chrome")) { System.setProperty("webdriver.chrome.driver",
		 * "./drivers/chromedriver.exe"); driver = new ChromeDriver(); } else if
		 * (browser.equals("firefox")) { System.setProperty("webdriver.gecko.driver",
		 * "./drivers/geckodriver.exe"); driver = new FirefoxDriver(); } else if
		 * (browser.equals("edge")) { System.setProperty("webdriver.edge.driver",
		 * "./drivers/edgedriver.exe"); driver = new EdgeDriver(); } else {
		 * System.setProperty("webdriver.safari.driver", "./drivers/safaridriver.exe");
		 * SafariDriver driver = new SafariDriver();
		 * 
		 * }
		 */

	}

	public static void main(String[] args) {

		LearnSwitchCase lsc = new LearnSwitchCase();

		lsc.openBrowser("firefox");

	}

}
