package eTicaret.core.abstracts;

public interface GoogleAuthService {
 void registerToSystem(String firstName,String lastName,String email,String password);
 void loginToSystem(String email,String password);
}
