package days19;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exception06 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Scanner sc = new Scanner(System.in);
		
		Date inDate = null;
		System.out.print("Enter Date like the following format : (ex:2021-11-11)");
		
		while(true) {
			try {
				String s = sc.nextLine();
				inDate = sdf.parse(s);
				break;
			} catch(ParseException e) {
				System.out.println("Please enter it again as the following format (YYYY-MM-DD)");
			}
		}
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf2.format(inDate));
	}
}
