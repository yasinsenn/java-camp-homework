package concrete;

import abstracts.BasePlayerManager;
import abstracts.PlayerCheckService;
import entities.Player;

public class PlayerManager extends BasePlayerManager {

	private PlayerCheckService playerCheckService;

	public PlayerManager(PlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void register(Player player) {

		if (playerCheckService.CheckIfRealPerson(player)) {
			System.out.println(
					player.getFirstName() + " " + player.getLastName() + " isimli oyuncu baþarýyla kayýt oldu...");
		}

		else {
			System.out.println("Kullanýcý doðrulanamadý kayýt baþarýsýz...");
		}

	}

}
