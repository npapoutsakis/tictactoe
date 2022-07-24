package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

import game.GameManager;

@SuppressWarnings("serial")
public class GUIDesign extends JFrame {
	
	GameManager manager = new GameManager();
	JButton[] thesis = new JButton[9];
	Container start = null;
	
	public GUIDesign() {
		
		super("TIC-TAC-TOE");
		
		JButton startButton = new JButton("START");
		startButton.setFont(new Font("Arial", Font.BOLD, 35));
		startButton.setActionCommand("START GAME");
		startButton.addActionListener(listener);
		
		start = getContentPane();
		start.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		start.add(startButton);
		
		
		
		
		this.addWindowListener(adapter);		
		setSize(300, 300);
		setVisible(true);
	}

	
	private void popTheWindow(){
		
		Container ttc_container;
		ttc_container = getContentPane();
		ttc_container.setLayout(new GridLayout(3, 3));
		
		for(int i = 0; i < 9; i++) {
			thesis[i] = new JButton();
			thesis[i].setActionCommand(""+i);
			thesis[i].addActionListener(listener);
			ttc_container.add(thesis[i]);
		}
		
		
		setVisible(true);
	}
	
	
	
	ActionListener listener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("0")) {
				thesis[0].setFont(new Font("Arial", Font.BOLD, 60));
				thesis[0].setText("X");
			}
			
			if(e.getActionCommand().equals("START GAME")){
				start.removeAll();
				start = null;
				popTheWindow();
			
				
			}
			
		}
	};	
	
	
	WindowAdapter adapter = new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
			
		};
	};
	
	
	public static void main(String[] args) {
		
		GUIDesign gui = new GUIDesign();
		
		return;
	}
	
}
