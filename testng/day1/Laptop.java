package testng.day1;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class Laptop {

	@Test(groups= {"functional"})
	public void getMouse() {
		System.out.println("mouse");

	}

	@Test(groups= {"regression"})
	public void getKeyboard() {
		System.out.println("keyboard");

	}

	@Test(groups= {"regression"})
	public void getMonitor() throws InterruptedException {
		System.out.println("monitor");
	

	}
	
	@Test(groups= {"smoke"})
	public void getPower() {
		System.out.println("power");
		throw new RuntimeException();

	}
	
	@Test(groups= {"smoke"})
	public void getUPS() {
		System.out.println("ups");
		

	}

}
