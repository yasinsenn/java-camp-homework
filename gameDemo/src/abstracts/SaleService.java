package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Player;

public interface SaleService {

	void sale(Game game, Campaign campaign, Player player);

	void sale(Game game, Player player);
}
