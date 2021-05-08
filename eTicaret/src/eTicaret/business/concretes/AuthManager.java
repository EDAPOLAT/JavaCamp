package eTicaret.business.concretes; 
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import eTicaret.core.abstracts.EmailService;
import eTicaret.business.abstracts.AuthService;
import eTicaret.business.abstracts.UserService;
import eTicaret.business.abstracts.UserValidationService;
import eTicaret.core.concretes.BusinessRules; 
import eTicaret.entities.concretes.User;
 

public class AuthManager  implements AuthService{
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	 
 	
 private UserService userService;
 private UserValidationService  userValidationService; 
 private EmailService emailService;
 
 public AuthManager(UserService userService,UserValidationService  userValidationService,EmailService emailService) {
	this.userService=userService;
	this.userValidationService=userValidationService;
	this.emailService=emailService;
	 

	
	 
}
	
  public void register(User user) {
	 var result=BusinessRules.run(userValidationService.validate(user), checkFormatEmail(user.getEmail()) );        
     if (result)
       {
    	 System.out.println("��lem ba�ar�l�.�yelik do�rulama linki mailinize g�nderildi.");
    	  emailService.mailSend( user.getEmail()); 
    	  emailService.isVerified(1);
    	  userService.add(user);
    	
    	 return ;
       }
     System.out.println("��lem ba�ar�s�z.Tekrar deneyiniz.");
     
      
     
  }
   
  public void login(String email, String password) {
 
	   var result=BusinessRules.run(!checkIfFields(email, password));
	   if(result) {
		   System.out.println("Sisteme giri� ba�ar�s�z.Tekrar deneyiniz.");
		   return ;
	   }
	   System.out.println("Sisteme giri� yapt�n�z. ");
  }
   
  
  private boolean checkIfFields(String email,String password)
  {  
	  if ( email.isEmpty() ||  password.isEmpty() )
		{
		  System.out.println("Eposta ve password alanlar� bo� ge�ilemez.");
			return false;
		}
		
		return true;
  }

 
	
   
  
	public boolean checkFormatEmail(String email) {
		var result= VALID_EMAIL_ADDRESS_REGEX.matcher(email).find();
		if(result) {
			return true;
		}
		System.out.println("Ge�ersiz email adresi girdiniz.");
		return false;
	}
	

}
