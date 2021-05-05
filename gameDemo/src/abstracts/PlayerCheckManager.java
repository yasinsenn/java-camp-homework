package abstracts;

import entities.Player;

public class PlayerCheckManager implements PlayerCheckService {

	@Override
	public boolean CheckIfRealPerson(Player player) {

		return true;
	}

}
