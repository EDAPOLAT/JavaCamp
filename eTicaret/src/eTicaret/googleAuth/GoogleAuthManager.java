package eTicaret.googleAuth;

public class GoogleAuthManager {
 public void register(String firstName,String lastName,String email,String password ) {
	 System.out.println("Google Hesabý ile kayýt olundu :" + email);
 }
 
 public void login(String email ,String password) {
	 System.out.println("Google Hesabý ile giriþ yapýldý :" + email);
 }
}
