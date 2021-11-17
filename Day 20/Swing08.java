package days20;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing08 {
	public static void main(String[] args) {
		new JGridLayout();
	}
}

class JGridLayout extends JFrame {
	JGridLayout() {
		Container con = getContentPane();
		con.setLayout(new GridLayout(3, 5, 20, 20));
		
		for(int i = 1; i <= 15; i++) 
			con.add(new JButton("Button " + i));
		setTitle("Grid Layout");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}