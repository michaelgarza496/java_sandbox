package BB;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		JFrame f = new JFrame("Brick Breaker");
		GamePlay gamePlay = new GamePlay();
		f.setBounds(10, 10, 700, 600);
		f.setResizable(false);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
