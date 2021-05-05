package gameProject;

public class CampaignManager implements CampaignService  {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya Eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya Silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya Güncellendi");
		
	}

	@Override
	public boolean validate(Campaign campaign) {

        if (campaign.getId()==1 && campaign.getCampaignName()=="%50 indirim")
        {
            return true;
        }
        else
        {
            return false;
        }
	}

}
