package days21;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Swing15 {
	public static void main(String[] args) {
		new JTextFieldTextArea();
	}
}

class JTextFieldTextArea extends JFrame implements ActionListener {
	JTextField jtf;
	JTextArea jta;
	
	JTextFieldTextArea() {
		jtf = new JTextField(10);
		jta = new JTextArea(7, 20);
		
		Font f = new Font("arieal", Font.BOLD, 20);
		jtf.setFont(f);
		jta.setFont(f);
		
		JButton k = new JButton("OK");
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		k.addActionListener(this);
		
		con.add(jtf);
		con.add(jta);
		con.add(k);
		
		setTitle("Text Field Text Area");
		setSize(400, 300);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = jtf.getText();
		jta.append(s + "\n");
		jtf.setText("");
	}
}