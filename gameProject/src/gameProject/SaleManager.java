package gameProject;

public class SaleManager implements SaleService {
	
	private CampaignService campaignService;
	
	 public SaleManager(CampaignService campaignService) {
		 
		 this.campaignService=campaignService;
	}
 
	@Override
	public void sale(Customer customer,Campaign campaign) {
		
		if (campaignService.validate(campaign)==true)
        {
            System.out.println(customer.getFirstName()+" "+"�simli oyuncuya sat�� kampanya �zerinden yap�ld�"); 
        }
        else
        {
        	 System.out.println("Sat�� yap�lmad�"); 
        }
		
		 
	}

}
