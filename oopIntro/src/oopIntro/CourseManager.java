package oopIntro;

public class CourseManager {

	public void addCourse(Course course) {
		System.out.println(course.name+"  "+"Kategorilere Eklendi");
		
	}

	public void deleteCourse(Course course) {
		System.out.println(course.name+"  "+"Kategorilerden Silindi");
	}
}
