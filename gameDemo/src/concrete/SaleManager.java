package concrete;

import abstracts.SaleService;
import entities.Campaign;
import entities.Game;
import entities.Player;

public class SaleManager implements SaleService {

	@Override
	public void sale(Game game, Player player) {

		System.out.println(game.getGameName() + " isimli oyun " + player.getFirstName() + " isimli oyuncuya "
				+ game.getGamePrice() + " TL fiyatýyla satýldý. NOT : Bu oyunda kampanyalar geçerli deðildir.");

	}

	@Override
	public void sale(Game game, Campaign campaign, Player player) {

		System.out.println("Oyun Adý: " + game.getGameName());
		System.out.println("Oyun Fiyatý: " + game.getGamePrice() + " TL ");
		System.out.println(
				"Kampanya Adý: " + campaign.getCampaingName() + " Ýndirim tutarý: % " + campaign.getCampaingDiscount());
		System.out.println("*********************");

		System.out.println(game.getGameName() + " isimli oyun " + player.getFirstName() + " isimli oyuncuya % "
				+ campaign.getCampaingDiscount() + " indirim uygulanarak "
				+ ((100 - campaign.getCampaingDiscount()) / 100) * game.getGamePrice() + " TL fiyatýyla satýldý.");

	}

}
