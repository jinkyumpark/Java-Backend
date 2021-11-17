package days20;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing04 {
	public static void main(String[] args) {
		new JImageTest();
	}
}

class JImageTest extends JFrame implements ActionListener {
	JLabel result;
	
	JImageTest() {
		ImageIcon ii1 = new ImageIcon("images/korea.gif");
		ImageIcon ii2 = new ImageIcon("images/germany9060.gif");
		ImageIcon ii3 = new ImageIcon("images/usa9060.gif");
		
		JButton korea = new JButton("Korea", ii1);
		JButton germany = new JButton("Germany", ii2);
		JButton usa = new JButton("USA", ii3);
		result = new JLabel("");
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(korea);
		con.add(germany);
		con.add(usa);
		con.add(result);
		
		korea.addActionListener(this);
		germany.addActionListener(this);
		usa.addActionListener(this);
		
		setTitle("Image Icon Test");
		setSize(600, 180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		result.setText(e.getActionCommand() + " selected.");
	}
}