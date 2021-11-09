package days17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatterClass02 {
	public static void main(String[] args) throws PraseException {
		SimpleDateFormat sdf1 = new SimpleDateForamt("yyyy/MM/dd");
		String s2 = "2020/11/24";
		
		Date d = sdf1.parse(s2);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf2.format(d));
	}
}
