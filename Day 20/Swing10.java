package days20;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Swing10 {
	public static void main(String[] args) {
		new JTextFieldTest();
	}
}

class JTextFieldTest extends JFrame implements ActionListener {
	JTextField jtf;
	
	JTextFieldTest() {
		jtf = new JTextField(30);
		
		JButton bt1 = new JButton("Nice to meet you");
		JButton bt2 = new JButton("Hello");
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(bt1);
		con.add(bt2);
		con.add(jtf);
		
		setTitle("Textfield Test");
		setSize(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String s1 = jtf.getText();
		String s = e.getActionCommand();
		jtf.setText(s1 + s);
	}
}