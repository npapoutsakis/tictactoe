package game;

import player.Player;
import util.StandardInputRead;

public class GameManager {
	
	public static void playGame() {
		
		StandardInputRead reader = new StandardInputRead();
		DataBase database = new DataBase();
		
		Player p0 = new Player(reader.readString("Player 1 Name: "));
		Player p1 = new Player(reader.readString("Player 2 Name: "));
		System.out.println();
		
		database.savePlayers(p0, p1);
		
		Tictactoe game = new Tictactoe(p0, p1);
		
		game.start();
	
		game.stop();

	}

}
