package abstracts;

import entities.Player;

public abstract class BasePlayerManager implements PlayerService {

	@Override
	public void register(Player player) {

		System.out
				.println(player.getFirstName() + " " + player.getLastName() + " isimli oyuncu ba�ar�yla kay�t oldu...");

	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " isimli oyuncu ba�ar�yla silindi...");

	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName() + " " + player.getLastName()
				+ " isimli oyuncu bilgileri ba�ar�yla g�ncellendi...");

	}
}
