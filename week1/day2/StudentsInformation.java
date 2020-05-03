package week1.day2;

public class StudentsInformation {
	
	public void getStudentName(int id) {
		
		if(id==100) {
			String name = "Hari" ;
			System.out.println(name);
		}
		else {
			System.out.println("no match");
		}
		
	}
	
	
	public int getAddress(int id , String name) {
		
		
		return 600128;
		

	}

	public static void main(String[] args) {
		
		StudentsInformation si = new StudentsInformation();
		
		si.getStudentName(200);
		
		//System.out.println(si.getAddress(100, "Hari"));
		
		
		int address = si.getAddress(100, "Hari");
		
		
		System.out.println(address);
		
		
		
		

	}

}
