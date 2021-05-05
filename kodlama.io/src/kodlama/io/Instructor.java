package kodlama.io;

public class Instructor extends User {
 
	String department;
	
 public Instructor() { 
	
 }
	
	public Instructor(String department) {
		super();
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
