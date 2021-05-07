package eTicaret;

import eTicaret.business.concretes.AuthManager;
import eTicaret.core.abstracts.GoogleAuthService;
import eTicaret.core.concretes.EmailManager;
import eTicaret.core.concretes.GoogleAuthManagerAdapter;
import eTicaret.business.concretes.UserManager;
import eTicaret.business.concretes.UserValidationManager;
import eTicaret.dataAccess.concretes.InMemoryUserDao;
import eTicaret.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		   
		 User user=new User(1,"aaa","fatma","eee@gmail.com","1234567");
		 User user2=new User(1,"aslý","gül","aaa@gmail.com","1234567");
		 User user3=new User(1,"aslý","gül","aaaa@gmail.com","1234567");
		  
		 AuthManager authManager=new AuthManager(new UserManager(new InMemoryUserDao() ),new UserValidationManager(),new EmailManager()  );
		 authManager.register(user);
		 
		 System.out.println("----------------------------------------------------------------------------------------------");
		 
		 authManager.register(user2);
		 
		 System.out.println("----------------------------------------------------------------------------------------------");
		 
		 authManager.register(user3);
		 
		 System.out.println("----------------------------------------------------------------------------------------------");
		  
		 authManager.login("kalem@gmail.com", "mjsjsj");
		 System.out.println("----------------------------------------------------------------------------------------------");
		 authManager.login("kalem@gmail.com", "");
		 
		 System.out.println("----------------------------------------------------------------------------------------------");
		 
	     GoogleAuthService googleAuthService=new GoogleAuthManagerAdapter();	
		  googleAuthService.registerToSystem("aslý", "fatma", "eee@gmail.com", "123456");
	}

}
