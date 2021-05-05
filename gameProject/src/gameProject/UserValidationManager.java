package gameProject;

public class UserValidationManager implements UserValidationService  {
  
	public boolean validate(Customer customer) { 
		
  
		if (customer.getNationalIdentity().length()==11)
            {
                return true;
            }
            else
            {
                return false;
            }
	}

}
