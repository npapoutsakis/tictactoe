package myApp;

import game.GameManager;

public class Main {

	public static void main(String[] args) {
		GameManager manager = new GameManager();
		
		manager.playGame();
		manager.stopGame();
	}

}
