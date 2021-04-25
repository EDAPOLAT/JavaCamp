package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		 System.out.println("Kurslar ve Kategoriler");
		
		 System.out.println("-------------------------------------------------------------------");
		
		 Course  course1=new Course(1,"C#","Engin Demiroð","Yazýlým Geliþtirici Yetiþtirme Kampý(C#+Angular)");
		 
		 Course course2=new Course(2,"Java","Engin Demiroð","Yazýlým Geliþtirici Yetiþtirme Kampý(Java+Angular)");
		 
		 Course [] courses={course1,course2};
		 
		 for(Course  course:courses ) {
			 System.out.println(course.id+" " +course.name+" "+course.instructor+" "+course.description);
 
		 }
		 
		 CourseManager courseManager=new CourseManager();
		 courseManager.addCourse(course1);
		 courseManager.addCourse(course2);
		 courseManager.deleteCourse(course2);
		 
		 System.out.println("--------------------------------------------------------------");
		 
		 Category category1=new Category(1,"Programlama"); 
		 
		 Category[] categories=new Category[] {category1};
		 
		 for(Category category:categories) {
			 System.out.println(category.id+" "+category.name );
			 
		 }
		 
		 CategoryManager categoryManager=new CategoryManager();
		 categoryManager.addCategory(category1);
		 categoryManager.deleteCategory(category1);
	}

}
