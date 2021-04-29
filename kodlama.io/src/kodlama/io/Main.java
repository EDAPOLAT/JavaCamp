package kodlama.io;

public class Main {

	public static void main(String[] args) {
		 
		Student student =new Student();
		student.setId(1);
		student.setFisrtName("Ayşe");
		student.setLastName("Fatma");
		student.setEmail("aabbc@gmail.com");
		student.setStudentNumber(12345);
		
	    StudentManager studentManager=new StudentManager();
	    studentManager.add(student );
	    
	    Instructor instructor =new Instructor();
	    instructor.setId(1);
	    instructor.setFisrtName("Ali");
	    instructor.setLastName("Veli");
	    instructor.setEmail("abc@gmail.com");
	    instructor.setDepartment("Yazılım");
	    
	    InstructorManager  instructorManager=new InstructorManager();
	    instructorManager.add(instructor);
	    
		  
		 

	  
		
				
		 
		 

	}

}
