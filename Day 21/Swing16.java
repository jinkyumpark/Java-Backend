package days21;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Swing16 {
	public static void main(String[] args) {
		new JCheckBoxTest();
	}
}

class JCheckBoxTest extends JFrame implements ItemListener {
	JTextField jtf;
	JCheckBox jcb1;
	JCheckBox jcb2;
	JCheckBox jcb3;
	JCheckBox jcb4;
	
	JCheckBoxTest() {
		jcb1 = new JCheckBox("JSP");
		jcb2 = new JCheckBox("PHP");
		jcb3 = new JCheckBox("ASP");
		jcb4 = new JCheckBox("SERVLET");
		jtf = new JTextField(30);
		
		Font f = new Font("arieal", Font.BOLD, 20);
		jcb1.setFont(f);
		jcb2.setFont(f);
		jcb3.setFont(f);
		jcb4.setFont(f);
		jtf.setFont(f);
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		con.add(jcb1);
		con.add(jcb2);
		con.add(jcb3);
		con.add(jcb4);
		con.add(jtf);
		
		setTitle("Checkbox Practice");
		setSize(800, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		jcb1.addItemListener(this);
		jcb2.addItemListener(this);
		jcb3.addItemListener(this);
		jcb4.addItemListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		String s = "";
		
		if(jcb1.isSelected()) s += "JSP ";
		if(jcb2.isSelected()) s += jcb2.getActionCommand() + " ";
		if(jcb3.isSelected()) s += "ASP ";
		if(jcb4.isSelected()) s += jcb4.getActionCommand() + " ";
		
		jtf.setText("Currently selected : " + s);
	}
}