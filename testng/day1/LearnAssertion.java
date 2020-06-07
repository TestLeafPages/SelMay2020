package testng.day1;

import java.util.NoSuchElementException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnAssertion {
	
	@Test
	public void testCase1() {
		
		//open the chrome browser
		
		// load leaf taps app
		
		// getTitle()
		
		String expTitle = "Leaftaps" ;
		
		String actTitle = "Leaftaps - TestLeaf Automation Platform";
		
		SoftAssert softAssert = new SoftAssert();
		
		
		//Hard Assert
	//	Assert.assertEquals(actTitle, expTitle);
		
		//Soft Assert
		softAssert.assertEquals(actTitle, expTitle);
		
		
		
		System.out.println(expTitle);
		
		//Hard Assert
	//	Assert.assertTrue(true);
		
		softAssert.assertTrue(true);
		
		
		
		softAssert.assertAll();
		
	
		
		/*
		 * if(expTitle.equals(actTitle)) { System.out.println("pass"); } else {
		 * System.out.println("fail"); }
		 */
		
		//throw new NoSuchElementException();
		

	}

}
