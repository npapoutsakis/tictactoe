package game;

import player.Player;

public class Tictactoe {
	
	String board[];
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
	
	public void start() {
		displayBoard();
	}

	//Will update data for both players
	private void updateStatus() {
	
	}
	
	//Will print the board on the console
	private void displayBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
	}
	
	//Will check if some player won
	private void checkWinner() {
		
	}
	
	
	
	
}
