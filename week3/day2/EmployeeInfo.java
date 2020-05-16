package week3.day2;

public final class EmployeeInfo {
	int empId;
	String empName;
	static String compName;
	final static int compPanNum=43423;
	
	/*
	 * static { System.out.println("static block"); compPanNum =434324; }
	 */
	
	EmployeeInfo(int id, String name, String cName){
		empId = id;
		empName = name;
		compName = cName;
		
		
	}
	
	
	public static void compAddress(String address) {
		System.out.println(address);

	}
	
	

	public static void main(String[] args) {
		EmployeeInfo emp1 = new EmployeeInfo(100,"Hari","TestLeaf");
		
		
		
		EmployeeInfo emp2 = new EmployeeInfo(200,"Prasad","TestLeaf Software Solutions");
		
		System.out.println(emp1.empId+" "+emp1.empName+" "+compName);
		
		System.out.println(emp2.empId+" "+emp2.empName+" "+compName);
		
		//compAddress("Nanganallur,Chennai");

	}

}
