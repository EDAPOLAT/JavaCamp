package gameProject;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.setId(2);
		customer.setFirstName("Ayþe");
		customer.setLastName("Fatma");
		customer.setNationalIdentity("11234234451");
		customer.setBirthYear(2021);
		
		Customer customer2=new Customer();
		customer2.setId(2);
		customer2.setFirstName("Ahmet") ;
		customer2.setLastName("Mehmet");
		customer.setBirthYear(12345);
		customer2.setNationalIdentity("12345678999");
		 
		
		CustomerManager customerManager=new CustomerManager ( new UserValidationManager() );  
		customerManager.add(customer );
		customerManager.add(customer2);
		
		Game game=new Game();
		game.setId(1);
		game.setName("Mario");
		
		GameManager gameManager=new GameManager();
		gameManager.add(game); 
		
		 
	     Campaign campaign1 =new Campaign();
		 campaign1.setId(1);
		 campaign1.setCampaignName("%50 indirim");
		  
			
		 CampaignManager campaignManager=new CampaignManager() ;
		 campaignManager.add(campaign1);
		 
		SaleManager saleManager=new SaleManager(new CampaignManager());
		saleManager.sale(customer2,campaign1);
		 
		 
		

	}

}
