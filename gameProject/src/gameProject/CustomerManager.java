package gameProject;

public class CustomerManager implements CustomerService {

	private  UserValidationService userValidationService;
	
	  public CustomerManager( UserValidationService userValidationService ) {
		 this.userValidationService=userValidationService;
	}
	
	
	@Override
	public void add(Customer customer) {
		if(userValidationService.validate(customer)==true ) {
			System.out.println("M��teri Eklendi"+" "+customer.getFirstName());
			return;
		}
		System.out.println("Kay�t ba�ar�s�z");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("M��teri silindi:"+customer.getFirstName());
		
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("M��teri g�ncellendi :"+customer.getFirstName());
		
		
	}

}
