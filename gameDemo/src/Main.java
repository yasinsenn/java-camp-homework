import java.sql.Date;

import adapters.MernisServiceAdapter;
import concrete.CampaignManager;
import concrete.GameManager;
import concrete.PlayerManager;
import concrete.SaleManager;
import entities.Campaign;
import entities.Game;
import entities.Player;

public class Main {

	public static void main(String[] args) {

		Player player1 = new Player(1, "Yasin", "Şen", "846875685", new Date(1997));
		Player player2 = new Player(2, "Yasin2", "Şen", "12947826", new Date(1996));

		Game game1 = new Game(1, "FİFA 21", 350);
		Game game2 = new Game(2, "Payday", 300);

		Campaign campaign1 = new Campaign(1, "Yaz Kampanyası", 20);

		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();
		SaleManager saleManager = new SaleManager();

		playerManager.register(player1);
		playerManager.register(player2);
		playerManager.delete(player1);
		playerManager.update(player1);

		System.out.println("===================================================");

		gameManager.add(game1);
		gameManager.delete(game1);
		gameManager.update(game1);

		System.out.println("===================================================");

		campaignManager.add(campaign1);
		campaignManager.delete(campaign1);
		campaignManager.update(campaign1);

		System.out.println("===================================================");

		saleManager.sale(game1, campaign1, player1);
		saleManager.sale(game2, player1);

	}

}
