package days17;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FormatterClass01 {
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(today));
		
		SimpleDateFormat sdf2, sdf3, sdf4, sdf5, sdf6, sdf7, sdf8, sdf9;
		
		sdf2 = new SimpleDateFormat("yy년 MM월 dd E요일");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		
		sdf5 = new SimpleDateFormat("D");
		sdf6 = new SimpleDateFormat("d");
		sdf7 = new SimpleDateFormat("w");
		sdf8 = new SimpleDateFormat("W");
		sdf9 = new SimpleDateFormat("F E");
		
		Calendar cal = Calendar.getInstance();
		Date day = cal.getTime();
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("yy-MM-dd E");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf1);
		System.out.println(sdf2);
		System.out.println(sdf3);
		System.out.println(sdf4);
	}
}
