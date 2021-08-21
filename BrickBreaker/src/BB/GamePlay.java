package BB;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

import javax.swing.JPanel;

public class GamePlay extends JPanel implements KeyListener, ActionListener {
	
	private boolean play;
	private int score;
	private int totalBricks;
	
	private Timer timer;
	private int delay;
	
	private int playerX;
	
	private int ballPosX;
	private int ballPosY;
	private int ballXDir;
	private int ballYDir;
	
	public GamePlay() {
		this.play = false;
		this.score = 0;
		this.totalBricks = 21;
		this.delay = 8;
		this.playerX = 310;
		
		this.ballPosX = 120;
		this.ballPosY = 350;
		this.ballXDir = -1;
		this.ballYDir = -2;
		
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer = new Timer(delay, this);
	}
	
	public void print(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(1, 1, 692, 592);
		
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 3, 562);
		g.fillRect(0, 0, 692, 3);
		g.fillRect(691, 0, 3, 592);
		
		g.setColor(Color.blue);
		g.fillRect(playerX, 550, 100, 8);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
