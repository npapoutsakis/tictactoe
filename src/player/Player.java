package player;

public class Player {
	
	private String name;
	private int games_played;
	private int wins; 
	
	public Player(String name, int games, int wins) {
		this.name = name;
		this.games_played = games;
		this.wins = wins;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGames_played() {
		return games_played;
	}

	public void setGames_played(int games_played) {
		this.games_played = games_played;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}
	
	public void printPlayerInfo() {
		System.out.println("Name: "+this.name);
		System.out.println("Games: "+this.games_played);
		System.out.println("Wins: "+this.wins);
	}
	
}
