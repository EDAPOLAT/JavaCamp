package eTicaret.core.concretes;

import eTicaret.core.abstracts.GoogleAuthService;
import eTicaret.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements GoogleAuthService{
	GoogleAuthManager googleAuthManager=new GoogleAuthManager();
	 

	@Override
	public void registerToSystem(String firstName,String lastName,String email,String password) {
		googleAuthManager.register(firstName,lastName,email, password);
		
	}

	@Override
	public void loginToSystem(String email, String password) {
		googleAuthManager.login(email, password);
		
	}

}
