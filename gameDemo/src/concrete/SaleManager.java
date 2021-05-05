package concrete;

import abstracts.SaleService;
import entities.Campaign;
import entities.Game;
import entities.Player;

public class SaleManager implements SaleService {

	@Override
	public void sale(Game game, Player player) {

		System.out.println(game.getGameName() + " isimli oyun " + player.getFirstName() + " isimli oyuncuya "
				+ game.getGamePrice() + " TL fiyat�yla sat�ld�. NOT : Bu oyunda kampanyalar ge�erli de�ildir.");

	}

	@Override
	public void sale(Game game, Campaign campaign, Player player) {

		System.out.println("Oyun Ad�: " + game.getGameName());
		System.out.println("Oyun Fiyat�: " + game.getGamePrice() + " TL ");
		System.out.println(
				"Kampanya Ad�: " + campaign.getCampaingName() + " �ndirim tutar�: % " + campaign.getCampaingDiscount());
		System.out.println("*********************");

		System.out.println(game.getGameName() + " isimli oyun " + player.getFirstName() + " isimli oyuncuya % "
				+ campaign.getCampaingDiscount() + " indirim uygulanarak "
				+ ((100 - campaign.getCampaingDiscount()) / 100) * game.getGamePrice() + " TL fiyat�yla sat�ld�.");

	}

}
