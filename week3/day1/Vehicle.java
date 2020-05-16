package week3.day1;

public class Vehicle {
	
	private String name = "xcent";

	void applyBrake() {
		System.out.println("new brake applied");

	}

	public void soundHorn() {
		System.out.println("Sound Horn");

	}

	public static void main(String[] args) {

		Vehicle veh = new Vehicle();

		veh.applyBrake();
		
		System.out.println(veh.name);
		
		
		
		
		
		

	}

}
