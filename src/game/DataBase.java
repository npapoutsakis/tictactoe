package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

import player.Player;

public class DataBase {
	
	LinkedList<Player> players;
	
	public DataBase() {
		players = new LinkedList<>();
	}
	
	
	private boolean exists(Player player) {
		for(Player p : players) {
			if (p.equals(player))
				return true;
		}
		return false;
	}

	//Cache
	public void savePlayers(Player p1, Player p2) {
		if(!exists(p1)) 
			players.add(p1);		
		
		if(!exists(p2))
			players.add(p2);
		
	}
	
	//Clear Cache
	public void clearCache() {
		this.players.clear();
	}
	
	public void printDataBase() {
		for(Player p : players) {
			p.printPlayerInfo();
			System.out.println();
		}
	}
	
	public boolean readAndCheck(String name, File f) {	    
		try {
			if(f.exists()) {
				try (Scanner scanner = new Scanner(f)) {
					if(scanner.hasNextLine() == false) {
						return false;
					}
					while (scanner.hasNextLine()) {
						String data = scanner.nextLine();
						if(name.equalsIgnoreCase(data)) {
							return true;
						}
					}
					scanner.close();
				}				
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error in readAndCheck func!!!");
		}
	    return false;
	}
	
	
	public void storePlayers() {	
		try {
			File f = new File("saved_players.txt");
			FileWriter writer = new FileWriter("saved_players.txt", true);
			String playerInfo = "";
			
			for(Player player : players) {
				if(!readAndCheck(player.getName(),f))
					playerInfo += player.getName() + "\n";
			}
			
			
			writer.append(playerInfo);
			writer.close();
			
//			if(players.size() == 2) {
//				this.clearCache();
//			}
			
		} 
		catch (IOException e) {
			System.out.println("wtf at storePlayers");
		}	
			
	}
	
	public void clearStorage() {
		File f = new File("saved_players.txt");
		f.delete();
	}
	
	
	//Only for Testing
	public static void main(String args[]) {
		
		Player p1, p2, p3, p4, p5;
		
		p1 = new Player("Dimitris");
		p2 = new Player("Dimitris");
		p3 = new Player("Dimitris");
		p4 = new Player("Dimitris");
		p5 = new Player("Dimitris");
		
		DataBase db = new DataBase();
	
		db.savePlayers(p1, p2);
		db.savePlayers(p1, p3);
		db.savePlayers(p4, p5);
		
		
		db.storePlayers();

		db.printDataBase();
		
		db.clearStorage();
	
		return;
		
	}
	
}
