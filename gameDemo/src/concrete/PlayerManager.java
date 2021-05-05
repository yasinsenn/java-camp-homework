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
					player.getFirstName() + " " + player.getLastName() + " isimli oyuncu ba�ar�yla kay�t oldu...");
		}

		else {
			System.out.println("Kullan�c� do�rulanamad� kay�t ba�ar�s�z...");
		}

	}

}
