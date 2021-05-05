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
            System.out.println(customer.getFirstName()+" "+"Ýsimli oyuncuya satýþ kampanya üzerinden yapýldý"); 
        }
        else
        {
        	 System.out.println("Satýþ yapýlmadý"); 
        }
		
		 
	}

}
