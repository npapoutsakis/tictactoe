package game;

import java.util.LinkedList;
import player.Player;

public class DataBase {
	
	LinkedList<Player> players;
	
	public DataBase() {
		players = new LinkedList<>();
	}
	
	
	private boolean exists(Player player) {
		for(Player p : players) {
			if (p.equals(player))
				return false;
		}
		return true;
	}

	public void savePlayers(Player p1, Player p2) {
		if(!exists(p1)) {
			players.add(p1);		
		}
		else if(!exists(p2)) {
			players.add(p2);
		}
	}
	
}
