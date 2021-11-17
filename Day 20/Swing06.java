package days20;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing06 {
	public static void main(String[] args) {
		new JFlowLayout();
	}
}

class JFlowLayout extends JFrame {
	JFlowLayout() {
//		JButton btn1 = new JButton("Button 1");
//		JButton btn2 = new JButton("Button 2");
//		Container con = getContentPane();
//		con.add(btn1);
//		con.add(btn2);
//		con.add(new JButton("Button 3"));
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 10));
		
		for(int i = 1; i <= 15; i++) {
			con.add(new JButton("Button " + i));
		}
		
		setTitle("Layout");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}