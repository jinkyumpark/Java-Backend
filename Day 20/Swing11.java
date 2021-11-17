package days20;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Swing11 {
	public static void main(String[] args) {
		new TextFieldEx();
	}
}

class TextFieldEx extends JFrame implements ActionListener {
	JTextField t1;
	JTextField t2;
	
	TextFieldEx() {
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		JButton b1 = new JButton(">");
		JButton b2 = new JButton("<");
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(t1);
		con.add(b1);
		con.add(b2);
		con.add(t2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setTitle("Text Field Test");
		setSize(600, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if(s.equals(">")) {
			if(!(t1.getText().equals(""))) {
				String s2 = t1.getText();
				t2.setText(s2);
				t1.setText("");
			}
		} else {
			if(!(t2.getText().equals(""))) {
				t1.setText(t2.getText());
				t2.setText("");
			}
		}
	}
}