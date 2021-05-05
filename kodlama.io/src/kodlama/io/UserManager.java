package kodlama.io;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFisrtName()+" "+user.getLastName()+" "+"Sisteme Eklendi "  );
	}
	
	
	public void delete(User user) {
		System.out.println(user.getFisrtName()+" "+"Sistemden Silindi : "  );
	}
}
