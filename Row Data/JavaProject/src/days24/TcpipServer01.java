package days24;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpipServer01 {
	public static void main(String[] args) {
//		String serverIp = "192.168.0.50";
		
		// Server Info Setting
		ServerSocket ss = null;
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		
		try {
			ss = new ServerSocket(7777);
			System.out.println(f.format(new Date()) + "Server is ready");
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println("Failed to configure server settings. Program terminated");
			return;
		}
		

			// Command that server start to waiting for client's request
			// like sc.nextLine(), it waits for client's request
			try {
				System.out.println(f.format(new Date()) + " waiting for client's request");
				Socket s = ss.accept();
				System.out.println(f.format(new Date()) + s.getInetAddress() 
				+ " requested from above address.");
				
				// Send message to Client : get permission from Socket s and save it to OutputStream
				OutputStream out = s.getOutputStream();
				// In order to include actual output tools, you need DataOutputStream having out as a parameter
				DataOutputStream dos = new DataOutputStream(out);
				
				// Using dos, you can send messages to client
				dos.writeUTF("[Announcement] Connection successful. 204-00 server connected.");
				
				System.out.println(f.format(new Date()) + " Message sent");
				dos.close();
				s.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}		
		
		try {
			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
