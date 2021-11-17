package days20;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing01 {
	public static void main(String[] args) {
		new ButtonTest();
	}
}

class ButtonTest extends JFrame {
	ButtonTest() {
		JButton male = new JButton("Male");
		JButton female = new JButton("Female");
		
		JLabel label = new JLabel("What's your gender?");
		
		Container con = getContentPane();
		
		con.setLayout(new FlowLayout());
		
		con.add(label);
		con.add(male);
		con.add(female);
		
		setTitle("Button Component Test");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}