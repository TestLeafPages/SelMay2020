package testng.day1;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;


public class TestCase1 {
	
	@Test//(retryAnalyzer = RetryTest.class)
	public void createLead() {
		System.out.println("Create Lead");
		
		throw new RuntimeException();

	}
	
	
	

}
