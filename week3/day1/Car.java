package week3.day1;

public class Car extends Vehicle {
	
	
	
	public void airCondition() {
		System.out.println("switch on air condition");

	}
	
	
	public static void main(String[] args) {
		
		Vehicle veh = new Vehicle();
		
		veh.applyBrake();
		veh.soundHorn();
		
		
		
		
		
		
		/*
		 * Car obj = new Car();
		 * 
		 * obj.airCondition(); obj.applyBrake(); obj.soundHorn();
		 */
	}

}
