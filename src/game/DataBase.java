package game;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedList;
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
	
	public void printDataBase() {
		for(Player p : players) {
			p.printPlayerInfo();
			System.out.println();
		}
	}
	
	public void storePlayers() {	
		byte[] data = new byte[64];
		try {
			
			RandomAccessFile file = new RandomAccessFile("data.txt","rw");
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			DataOutputStream dos = new DataOutputStream(bos);
			
			for(Player p : this.players)
				dos.write(p.makeByteArray());
			
			dos.close();
			
			byte[] buffer = bos.toByteArray();
			System.arraycopy(buffer, 0, data, 0, buffer.length);
			bos.close();
			
			file.seek(0);
			file.write(data);
			
			file.close();
							
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
	
	
}
