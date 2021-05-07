package eTicaret.business.concretes; 
import java.util.regex.Pattern;

import eTicaret.business.abstracts.UserService;
import eTicaret.business.abstracts.UserValidationService;
import eTicaret.core.concretes.BusinessRules; 
import eTicaret.entities.concretes.User;

public class UserValidationManager implements UserValidationService {

	
	
	@Override
	public boolean validate(User user) {

    boolean result=BusinessRules.run(checkIfUserPassword(user),checkIfUserName(user),checkIfUserLastName(user),
    	 checkIfFields(user)  );
        if ( result )
        {
            return true;
        }
 
      return false;
	}
 
	 private boolean checkIfFields(User user)
    {  
        if ( user.getPassword().isEmpty() || user.getLastName().isEmpty() ||  user.getEmail().isEmpty() ||  user.getPassword().isEmpty())
        {
        	System.out.println("Alanlar boþ geçilemez.");
            return false;
        }
       return true;
    }

	 private boolean checkIfUserPassword(User user)
     {  
         if ( user.getPassword().length()<6)
         {
        	 System.out.println("Parola en az 6 karakterden oluþmalýdýr.");
        	  return false;
         }
         return true;
     }
	 
	 private boolean checkIfUserName(User user)
     {  
         if (user.getFirstName().length()<2)
         {
        	 System.out.println("Kullanýcý adý en az 2 karakterden oluþmalýdýr.");
             return false;
         }
        return true;
     }
	 
	 private boolean checkIfUserLastName(User user)
     {  
         if (user.getLastName().length()<2)
         {
        	 System.out.println("Kullanýcý soyadý en az 2 karakterden oluþmalýdýr.");
             return false;
         }
        return true;
     }
	 

		
		
		 
} 
