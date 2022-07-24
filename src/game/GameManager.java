package game;

import player.Player;
import util.StandardInputRead;

public class GameManager {
	
	public StandardInputRead reader;
	private DataBase db;
	public Player no1;
	public Player no2;
	
	
	public GameManager() {
		reader = new StandardInputRead();
		db = new DataBase();
		no1 = new Player();
		no2 = new Player();
	}
	
	public void playGame() {
		
		no1.setName(reader.readString("Player 1 Name: "));
		no2.setName(reader.readString("Player 2 Name: "));
		System.out.println();
		
		//Save players in cache -> ArrayList
		db.savePlayers(no1, no2);
		
		//Store name in file -> warn that the name all ready exists
		db.storePlayers();
		
		Tictactoe game = new Tictactoe(no1, no2);
		
		Boolean wonna_play = true;
		
		while(wonna_play == true) {
			
			game.start();
			
			game.stop();
			
			String answer = reader.readString("Continue?: ");
			
			if(answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n") || !answer.equalsIgnoreCase("y")) {
				wonna_play = false;
			}
			else 
				wonna_play = true;				
			
		}
		
		game = null;
	}
	
	
	public void stopGame() {
		db.printDataBase();
		no1 = null;
		no2 = null;
		return;
	}

	
}
