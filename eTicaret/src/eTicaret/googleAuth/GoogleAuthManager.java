package eTicaret.googleAuth;

public class GoogleAuthManager {
 public void register(String firstName,String lastName,String email,String password ) {
	 System.out.println("Google Hesab� ile kay�t olundu :" + email);
 }
 
 public void login(String email ,String password) {
	 System.out.println("Google Hesab� ile giri� yap�ld� :" + email);
 }
}
