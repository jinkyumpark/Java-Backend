import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.UnknownHostException;
import java.net.Socket;

public class tcpipClient011 {
	public static void main(String[] args) {
		String serverIp = "192.168.0.50";
		
		try {
			Socket s = new Socket(serverIp, 7777);
			// If ip and port number server exists, execute following command, else catch
			
			InputStream in = s.getInputStream();
			
			DataInputStream dis = new DataInputStream(in);
			String m = dis.readUTF();
			// print data got from Socket
			System.out.println("Received Message : " + m);
			System.out.println("Connection Terminating...");
			dis.close();
			s.close();
			System.out.println("Connection Terminated");
			
		} catch(UnknownHostException e) {
			e.printStackTrace();
		} catch(IOException e ) {
			e.printStackTrace();
		}
		
		
	}
}
