package main;

import java.awt.Color;
import java.util.Random;

import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(300,250);
		window.setResizable(false);
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		
		JLabel JL = new JLabel();
		GamePanel gP = new GamePanel();
		window.add(gP);
		window.pack();
		gP.startGameThread();
		//important: finish!

		}

}

