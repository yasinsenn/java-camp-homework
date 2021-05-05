package abstracts;

import entities.Player;

public abstract class BasePlayerManager implements PlayerService {

	@Override
	public void register(Player player) {

		System.out
				.println(player.getFirstName() + " " + player.getLastName() + " isimli oyuncu baþarýyla kayýt oldu...");

	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " isimli oyuncu baþarýyla silindi...");

	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName() + " " + player.getLastName()
				+ " isimli oyuncu bilgileri baþarýyla güncellendi...");

	}
}
