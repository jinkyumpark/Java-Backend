package days19;
import java.io.File;
import java.io.IOException;

public class Exception08 {
	public static void main(String[] args) {
		File f1 = createFile("");
		File f2 = createFile("abc.txt");
		File f3 = createFile("");
	}
	
	public static File createFile(String fileName) {
		File f = null;
		int cnt = 0;
		try {
			if(fileName == null || fileName.equals(""))
				throw new Exception("File name not valid");
		} catch(IOException e) {
			fileName = "NoTitle" + ++cnt + ".txt";
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			f = new File(fileName);
			try {
				f.createNewFile();
			} catch(IOException e) {
				System.out.println("Failed to create file");
			}
		}
		return f;
	}
}
