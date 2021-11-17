package days20;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing09 {
	public static void main(String[] args) {
		new GridFruts();
	}
}

class GridFruts extends JFrame implements ActionListener {
	JLabel result;
	
	GridFruts() {
		Container con = getContentPane();
		con.setLayout(new GridLayout(3, 2));
		
		ImageIcon i1 = new ImageIcon("images/apple.jpg");
		ImageIcon i2 = new ImageIcon("images/persimmon.jpg");
		ImageIcon i3 = new ImageIcon("images/pear.jpg");
		ImageIcon i4 = new ImageIcon("images/banana.jpg");
		ImageIcon i5 = new ImageIcon("images/cherry.jpg");
		
		JButton apple = new JButton("Apple", i1);
		JButton persimmon = new JButton("Persimmon", i2);
		JButton pear = new JButton("Pear", i3);
		JButton banana = new JButton("Banana", i4);
		JButton cherry = new JButton("Cheery", i5);
		result = new JLabel("");
		
		con.add(apple);
		con.add(persimmon);
		con.add(pear);
		con.add(banana);
		con.add(cherry);
		con.add(result);
		
		apple.addActionListener(this);
		persimmon.addActionListener(this);
		pear.addActionListener(this);
		banana.addActionListener(this);
		cherry.addActionListener(this);
		
		setTitle("Fruit selection Practice");
		setSize(260, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		result.setText(e.getActionCommand() + " Selected");
	}
}



