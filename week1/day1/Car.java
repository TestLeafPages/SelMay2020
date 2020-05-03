package week1.day1;

public class Car {

	String carColor = "Red";

	double carPriceInLakhs = 7.5;
	long ownerMob = 8884151543L;

	int fuelCapacity = 350;

	boolean isUsed = false;

	char fuelType = 'P';
	
	
	

	public void driveCar() {
		int speed = 50;
		System.out.println(speed);
		System.out.println("driving a car");

	}

	public static void main(String[] args) {

		
		
		// ClassName objectName = new ClassName();

		Car myCar = new Car();

		myCar.driveCar();
		
		//System.out.println(myCar.carPriceInLakhs);
		
	//	double carPrice = myCar.carPriceInLakhs;
		 
		  double carPrice = myCar.carPriceInLakhs;
		  
		  System.out.println(carPrice);
		 
		 
		
		
		
		
		
		
		
		

	}

}
