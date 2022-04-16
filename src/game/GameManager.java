package game;

import player.Player;
import util.StandardInputRead;

public class GameManager {
	
	public static void startGame() {
		StandardInputRead reader = new StandardInputRead();
		
		Player p1 = new Player(reader.readString("Give O's Name: "));
		Player p2 = new Player(reader.readString("Give X's Name: "));
		
		Tictactoe game = new Tictactoe(p1, p2);
		
		game.start();
		
	}

	public static void stopGame() {
		
		System.out.println("Game Terminated!");
	}
	
}
