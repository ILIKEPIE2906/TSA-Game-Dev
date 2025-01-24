package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	final int OGtileSize = 16;
	final int playerSize=9;
	final int scale = 5;
	final int tileSize = scale*OGtileSize;
	final int screenRow = 13;
	final int screenColumn = 10;
	final int screenWidth = tileSize*screenRow;
	final int screenHeight = tileSize*screenColumn;
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		Color lBlue = new Color(30,150,200);
		this.setBackground(lBlue);
		this.setDoubleBuffered(true);
		
	}
	
	Thread gameThread;
	
	public void startGameThread() {
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	public void run() {
		while (gameThread != null) {
			update();
			repaint();
		}
	}
	public void update() {
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		 //1=Mountain, 2=Plains, 3=Forest
		ArrayList<Biome> listTypes = new ArrayList<>();
		listTypes.add(new Plains());
		listTypes.add(new Plains());
		listTypes.add(new Plains());
		listTypes.add(new Plains());
		listTypes.add(new Forest());
		listTypes.add(new Forest());
		listTypes.add(new Forest());
		listTypes.add(new Forest());
		listTypes.add(new Hills());
		listTypes.add(new Hills());
		listTypes.add(new Hills());
		g2.setColor(Color.yellow);
		g2.fillRect(8*OGtileSize*scale, 3*OGtileSize*scale, tileSize, tileSize);
		//Collections.shuffle(listTypes);	
		g2.setColor(listTypes.get(0).color);
		g2.fillRect(9*OGtileSize*scale,3*OGtileSize*scale, tileSize, tileSize);
		g2.setColor(listTypes.get(1).color);
		g2.fillRect(7*OGtileSize*scale,4*OGtileSize*scale, tileSize, tileSize);
		g2.setColor(listTypes.get(2).color);
		g2.fillRect(8*OGtileSize*scale,4*OGtileSize*scale, tileSize, tileSize);
		g2.setColor(listTypes.get(3).color);
		g2.fillRect(9*OGtileSize*scale,4*OGtileSize*scale, tileSize, tileSize);
		g2.setColor(listTypes.get(4).color);
		g2.fillRect(10*OGtileSize*scale,4*OGtileSize*scale, tileSize, tileSize);
		g2.setColor(listTypes.get(5).color);
		g2.fillRect(7*OGtileSize*scale,5*OGtileSize*scale, tileSize, tileSize);
		g2.setColor(listTypes.get(6).color);
		g2.fillRect(8*OGtileSize*scale,5*OGtileSize*scale, tileSize, tileSize);
		g2.setColor(listTypes.get(7).color);
		g2.fillRect(9*OGtileSize*scale,5*OGtileSize*scale, tileSize, tileSize);
		g2.setColor(listTypes.get(8).color);
		g2.fillRect(10*OGtileSize*scale,5*OGtileSize*scale, tileSize, tileSize);
		g2.setColor(listTypes.get(9).color);
		g2.fillRect(8*OGtileSize*scale,6*OGtileSize*scale, tileSize, tileSize);
		g2.setColor(listTypes.get(10).color);
		g2.fillRect(9*OGtileSize*scale,6*OGtileSize*scale, tileSize, tileSize);
		g2.dispose();
		
		//JLabel Title = new JLabel("Lost Amongst the Waves");
		//Title.setHorizontalTextPosition(screenWidth/2);
		//Title.setVerticalTextPosition(48);		
	}
}
