import java.io.IOException;
import java.net.Socket;
import java.rmi.UnknownHostException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import java.util.Scanner;


public class tcpipClient031 {
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

class Sender extends Thread {
	Socket socket;
	DataOutputStream out;
	String name;
	
	Sender(Socket s) {
		this.socket = s;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			name = "[" + socket.getInetAddress() + ":" + socket.getPort() + "]";
  		} catch(IOException e ) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
	 	while(out != null) {
	 		try {
	 			out.writeUTF(name + sc.nextLine());	
	 		} catch(IOException e) {
	 			e.printStackTrace();
	 		}
	 	}
	}
}

class Receiver extends Thread {
	Socket socket;
	DataInputStream in;
	
	Receiver(Socket s) {
		this.socket = s;
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		while(in != null) {
			try {
				System.out.println(in.readUTF());
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}