package testcase;

import org.testng.annotations.Test;

public class Battery {
	@Test(invocationCount = 3)
	public void hasPower() {
		
		System.out.println("power");

	}

	@Test
	public void isBatteryWorking() throws InterruptedException {
		System.out.println("working condition");
		Thread.sleep(3000);
	}
	
	
	@Test(enabled=false)
	public void havingCharge() {
		System.out.println("enough charge");
	}
}
