package oopIntro;

public class CategoryManager {
	
	public void addCategory(Category category) {
		System.out.println(category.name+"  "+"Kategorilere Eklendi");
		
	}

	public void deleteCategory(Category category) {
		System.out.println(category.name+"  "+"Kategorilerden Silindi");
	}
}
