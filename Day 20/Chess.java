package days20;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Chess {
	public static void main(String[] args) {
		new ChessBoard();
	}
}

class ChessBoard extends JFrame {
	ChessBoard() {
		Container con = getContentPane();
		con.setLayout(new GridLayout(8, 8));
		
		for(int i = 1; i <= 8; i++) {
			for(int j = 1; j <= 8; j++) {
				con.add(new JButton(i + " " + j));
			}
		}
		setTitle("Chess");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}