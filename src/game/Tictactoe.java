package game;

import player.Player;

public class Tictactoe {
	
	String board[];
	Player winner;
	String turn;
	Boolean draw; 
	Player O;
	Player X;
	
	public Tictactoe(Player no1, Player no2) {
		this.O = no1;
		this.X = no2;
		board = new String[9];
	}
	
	public void start() {
		resetBoard();
		displayBoard();
	}

	public void stop() {
		System.out.println("Game Terminated!");
		resetBoard();
	}
	
	
	private void updateStatus(Player winner, Player loser) {
		
		if (draw) {
			winner.updatePlayerData("draw");
			loser.updatePlayerData("draw");
		}else {
			winner.updatePlayerData("win");
			loser.updatePlayerData("lose");
		}
		
	}
	
	//Will fill the array with spaces
	private void resetBoard() {	
		for(int i = 0; i < board.length; i++) {
			board[i] = " ";
		}
	}
	
	
	//Will print the board on the console
	private void displayBoard() {
		System.out.println("|-----------|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|-----------|");
	}
	
	
	//Will check if some player won
	public Player checkWinner() {
		for (int a = 0; a < 8; a++) 
		{
			String line = null;
			
			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			
			//For X winner
			if (line.equals("XXX")) {
				draw = false;
				updateStatus(X, O);
				return X;
			}
	              
			// For O winner
			else if (line.equals("OOO")) {
				draw = false;
				updateStatus(O, X);
				return O;
			}
		}
	    
		//If we find an empty space, the game isn't over
		for(String str : board) {
			if(str.equals(" "))
				System.out.println("Not Finished Yet!");
				draw = false;
				return null;
		}
		
		//If null & draw = true we have a draw
		//Here check for draw, and update status
		draw = true;
		updateStatus(X, O);
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
}
