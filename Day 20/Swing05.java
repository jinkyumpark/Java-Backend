package days20;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing05 {
	public static void main(String[] args) {
		new JButtonEvent();
	}
}

class JButtonEvent extends JFrame {
	JButtonEvent() {
		ImageIcon korea = new ImageIcon("images/korea1.gif");
		ImageIcon usa = new ImageIcon("inages/usa.gif");
		ImageIcon germany = new ImageIcon("images/germany.gif");
		
		JButton eventButton = new JButton(korea);
		eventButton.setRolloverIcon(usa);
		eventButton.setPressedIcon(germany);
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(eventButton);
		
		setTitle("Button own event handling");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}