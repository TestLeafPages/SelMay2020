package testng.day2;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends ParentClass{
	
	@BeforeTest
	public void setFileName() {
		workBookName ="EditLead";

	}

	@Test(dataProvider = "fetchData")
	public void runEditLead(String phno, String company) throws InterruptedException {
		
		  driver.findElementByLinkText("Find Leads").click();
		  driver.findElementByXPath("//span[text()='Phone']").click();
		  driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phno);
		  driver.findElementByXPath("//button[text()='Find Leads']").click();
		  Thread.sleep(2000); driver.
		  findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"
		  ).click(); driver.findElementByLinkText("Edit").click();
		  driver.findElementById("updateLeadForm_companyName").sendKeys(company);
		  driver.findElementByName("submitButton").click(); 
		 
}
	
	
	
	
	
}






