package days20;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing07 {
	public static void main(String[] args) {
		new JBorderLayout();
	}
}


class JBorderLayout extends JFrame {
	JBorderLayout() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout(10, 10));
		
		JButton b1 = new JButton("East Button");
		con.add(b1, BorderLayout.EAST);
		con.add(new JButton("West Button"), BorderLayout.WEST);
		con.add(new JButton("South Button"), BorderLayout.SOUTH);
		con.add(new JButton("North Button"), BorderLayout.NORTH);
		con.add(new JButton("Middle Button"), BorderLayout.CENTER);
		
		setTitle("Border Layout");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}