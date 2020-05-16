package week3.day2;

public class Employee extends Company{

	int empId;
	String empName;

	Employee() {
		this(100,"Hari");
		empId = 200;
		empName = "Prasad";

		System.out.println(empId + " " + empName);
	}

	Employee(int empId, String empName) {

		//this();
		this.empId = empId;
		this.empName = empName;

		System.out.println(this.empId + " " + this.empName);
		this.empDetails();
	
	}
	
	public void empDetails() {
		
		System.out.println("Address: Chennai");
		super.compDetails();

	}
	
	

	public static void main(String[] args) {

		Employee emp = new Employee();
		
		emp.empDetails();
		
		EmployeeInfo.compAddress("Chennai");
		
		

		/*
		 * System.out.println(emp.empId); System.out.println(emp.empName);
		 */

	}

}
