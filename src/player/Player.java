package player;

public class Player {
	
	private String name;
	private int games_played;
	private int wins;
	private int draws;
	private int loses;
	
	public Player() { }
	
	public Player(String name) {
		this.name = name;
		this.resetPlayerData();
	}

	public int getDraws() {
		return draws;
	}

	public void setDraws(int draws) {
		this.draws = draws;
	}

	public int getLoses() {
		return loses;
	}

	public void setLoses(int loses) {
		this.loses = loses;
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
		System.out.println("Loses: "+this.loses);
		System.out.println("Draws: "+this.draws);
	}
	
	public void updatePlayerData(String state) {
		
		switch(state) {
			case "win": 
				this.wins++;
				break;
			
			case "lose":
				this.loses++;
				break;
				
			case "draw":
				this.draws++;
				break;
		}
		
		//No matter the state, the game had played
		this.games_played++;

	}
	
	public void resetPlayerData() {
		this.games_played = 0;
		this.wins = 0;
		this.draws = 0;
		this.loses = 0;
	}
	

	
}
