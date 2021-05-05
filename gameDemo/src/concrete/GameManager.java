package concrete;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " isimli oyun sisteme eklendi...");

	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " isimli oyun sistemden kaldýrýldý...");

	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " isimli oyun bilgileri güncellendi...");

	}

}
