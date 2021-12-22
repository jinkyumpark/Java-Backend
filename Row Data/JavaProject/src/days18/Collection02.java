package days18;

import java.util.ArrayList;

public class Collection02 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		
		a.add(10);
		a.add(1.1);
		a.add("Hello");
		Integer i0 = (Integer) a.get(0);
		Integer i1 = (Integer) a.get(1);
		Double i2 = (Double) a.get(1);
		String i3 = (String) a.get(2);
		
		System.out.printf("i0 -> %d\n", i0);
		System.out.printf("i2 -> %.1f\n", i2);
		System.out.printf("i3 -> %s\n", i3);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(100);
		Integer i = list.get(0);
		System.out.printf("list[%d] = %d",0, i);
	} 
}
