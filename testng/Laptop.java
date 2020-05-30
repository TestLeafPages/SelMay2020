package testcase;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class Laptop {
	
	/*
	 * @Test public void getMouse() { System.out.println("mouse"); throw new
	 * NoSuchElementException();
	 * 
	 * }
	 */
	
	@Test(dependsOnMethods= {"testcase.Battery.hasPower"})
	public void getKeyboard() {
		System.out.println("keyboard");

	}
	/*
	 * @Test public void getMonitor() { System.out.println("monitor");
	 * 
	 * }
	 */

}
