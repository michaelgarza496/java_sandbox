package BB;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

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
		timer.start();
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(1, 1, 692, 592);
		
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 3, 562);
		g.fillRect(0, 0, 692, 3);
		g.fillRect(691, 0, 3, 592);
		
		g.setColor(Color.blue);
		g.fillRect(playerX, 550, 100, 8);
		
		g.setColor(Color.green);
		g.fillOval(ballPosX, ballPosY, 20, 20);
		
		g.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		timer.start();
		
		if (play) {
			if (new Rectangle(ballPosX, ballPosY, 20, 30).intersects(new Rectangle(playerX, 550, 100, 8))) {
				ballYDir = -ballYDir;
			}	
			
			ballPosX += ballXDir;
			ballPosY += ballYDir;
			if (ballPosX < 0) {
				ballPosX = 0;
				ballXDir = -ballXDir;
			} else if (ballPosX > 670) {
				ballPosX = 670;
				ballXDir = -ballXDir;
			}
			if (ballPosY < 0) {
				ballPosY = 0;
				ballYDir = -ballYDir;
			}
		}
		
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		
		if (arg0.getKeyCode() == KeyEvent.VK_RIGHT) {
			if (playerX > 600) {
				playerX = 600;
			} else {
				moveRight();
			}
		}
		
		if (arg0.getKeyCode() == KeyEvent.VK_LEFT) {
			if (playerX < 10) {
				playerX = 10;
			} else {
				moveLeft();
			}
		}
	}

	private void moveRight() {
		play = true;
		playerX += 20;
	}
	
	private void moveLeft() {
		play = true;
		playerX -= 20;
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
