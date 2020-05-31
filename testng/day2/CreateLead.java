package testng.day2;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ParentClass {
	
	@BeforeTest
	public void setFileName() {
		workBookName ="CreateLead";

	}
	

	@Test(dataProvider = "fetchData")
	public void runCreateLead(String company, String fName, String lName) {

		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(company);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys("R");
		driver.findElementByName("submitButton").click();

	}

	/*
	 * @DataProvider(name="fetchData") public String[][] sendData() throws
	 * IOException {
	 * 
	 * 
	 * ReadExcel excel = new ReadExcel();
	 * 
	 * String[][] data = excel.readData();
	 * 
	 * 
	 * //String[][] data = ReadExcel.readData();
	 * 
	 * // String[][] data = ReadExcel.readData();
	 * 
	 * // return ReadExcel.readData();
	 * 
	 * return ReadExcel.readData("CreateLead");
	 * 
	 * 
	 * String[][] data = new String[2][3];
	 * 
	 * data[0][0] = "TestLeaf"; data[0][1] = "Hari"; data[0][2] = "R";
	 * 
	 * data[1][0] = "TL"; data[1][1] = "Dhivya"; data[1][2] = "P";
	 * 
	 * 
	 * 
	 * return data;
	 * 
	 * 
	 * }
	 */

}
