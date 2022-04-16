package game;

import player.Player;

public class Tictactoe {
	
	Player O;
	Player X;
	
	public Tictactoe() {
		O = null;
		X = null;
	}
	
	public Tictactoe(Player no1, Player no2) {
		this.O = no1;
		this.X = no2;
	}
	
	public Player getO() {
		return O;
	}

	public void setO(Player o) {
		O = o;
	}

	public Player getX() {
		return X;
	}

	public void setX(Player x) {
		X = x;
	}

	//Will update data for both players
	public void updateStatus() {
	
	}
	
	
	
	
}
