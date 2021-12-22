package days24;

import java.io.IOException;
import java.net.Socket;
import java.rmi.UnknownHostException;

public class tcpipClient03 {
	public static void main(String[] args) {
		String serverIp = "192.168.0.50";
		try {
			Socket s = new Socket(serverIp, 7777);
			System.out.println("Connected to server");
			Sender sender = new Sender(s);
			Receiver receiver = new Receiver(s);
			sender.start();
			receiver.start();
		} catch(UnknownHostException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
