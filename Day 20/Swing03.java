package days20;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing03 {
	public static void main(String[] args) {
		new ButtonEvent();
	}
}

class ButtonEvent extends JFrame implements ActionListener {
	JLabel result;
	
	ButtonEvent() {
		JButton male = new JButton("Male");
		JButton female = new JButton("Female");
		JLabel label = new JLabel("What's your gender?");
		result = new JLabel("");
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(label);
		con.add(male);
		con.add(female);
		con.add(result);
		
		male.addActionListener(this);
		female.addActionListener(this);
		
		setTitle("Button Event Test");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		result.setText(s);
	}
}
