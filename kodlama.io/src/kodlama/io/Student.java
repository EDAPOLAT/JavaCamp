package kodlama.io;

public class Student extends User{
	
	 private int studentNumber;
	 private String[] courses;
    
	public Student() {
		
	}

	public Student(int studentNumber, String[] courses) {
		super();
		this.studentNumber = studentNumber;
		this.courses = courses;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}
     
    
	 
 

	 
 
}
