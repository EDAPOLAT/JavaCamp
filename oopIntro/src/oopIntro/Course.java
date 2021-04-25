package oopIntro;

public class Course {
	public Course()
	{
		System.out.println("iþlem baþarýlý");
	}
	
	public Course(int id,String name,String instructor,String description ) {
		this.id=id;
		this.name=name;
		this.instructor=instructor; 
		this.description=description;
	}

	int id;
	String name;
	String instructor; 
	String description;


}
