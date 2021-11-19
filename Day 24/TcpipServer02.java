package days24;

import java.net.Socket;
import java.net.SocketTimeoutException;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TcpipServer02 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		
		try {
			ss = new ServerSocket(7777);
			System.out.println(f.format(new Date()) + " server is ready.");
		} catch(IOException e) {
			System.out.println("Server Setting Failed. Program Terminated");
			return;
		}
		
		while(true) {
			try {
				System.out.println(f.format(new Date()) + " waiting for connection");
				ss.setSoTimeout(10000); // set time Server socket waiting for request
				Socket s = ss.accept();
				System.out.println(f.format(new Date()) + s.getInetAddress() + " requested");
				OutputStream out = s.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				dos.writeUTF("Hi!");
				System.out.println();
				dos.close();
				s.close();
			} catch(SocketTimeoutException e) {
				System.out.println(f.format(new Date()) + " connection timeout. Server Terminated");
				System.exit(0); // program terminating statement like return
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
