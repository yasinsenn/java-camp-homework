package concrete;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaingName() + "isimli kampanya sisteme eklendi");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaingName() + "isimli kampanya sistemden kaldýrýldý");

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaingName() + "isimli kampanya bilgileri güncellendi");
	}

}
