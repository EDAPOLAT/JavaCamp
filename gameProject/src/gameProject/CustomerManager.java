package gameProject;

public class CustomerManager implements CustomerService {

	private  UserValidationService userValidationService;
	
	  public CustomerManager( UserValidationService userValidationService ) {
		 this.userValidationService=userValidationService;
	}
	
	
	@Override
	public void add(Customer customer) {
		if(userValidationService.validate(customer)==true ) {
			System.out.println("Müþteri Eklendi"+" "+customer.getFirstName());
			return;
		}
		System.out.println("Kayýt baþarýsýz");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi:"+customer.getFirstName());
		
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Müþteri güncellendi :"+customer.getFirstName());
		
		
	}

}
