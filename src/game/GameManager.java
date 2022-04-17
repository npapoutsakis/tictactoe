package game;

import player.Player;
import util.StandardInputRead;

public class GameManager {
	
	public static void playGame() {
		StandardInputRead reader = new StandardInputRead();
		DataBase database = new DataBase();
		
		Player p1 = new Player(reader.readString("Give O's Name: "));
		Player p2 = new Player(reader.readString("Give X's Name: "));
		
		Tictactoe game = new Tictactoe(p1, p2);
		
		database.savePlayers(p1, p2);
		
		game.start();
		
		int pos = reader.readPositiveInt("5");
		//input form user comes here
		
		
		
		
		
		game.stop();
	
	}

}
