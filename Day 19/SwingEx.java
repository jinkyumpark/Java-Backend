package days19;
import javax.swing.JFrame;

public class SwingEx {
	public static void main(String[] args) {
		WindowTest win = new WindowTest();
	}
}

class WindowTest extends JFrame {
	WindowTest() {
		setTitle("Window Test");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}