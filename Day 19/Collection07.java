package days19;

import java.util.ArrayList;

public class Collection07 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10); list.add(20); list.add(30);
		
		int target_index = list.indexOf(20);
		System.out.printf("Index of 20 : %d\n", target_index);
		
		target_index = list.indexOf(50);
		System.out.printf("Index of 50 : %d\n", target_index);
		
		System.out.printf("Is 20 present? : %b\n", list.contains(20));
		System.out.printf("Is 50 presnet? %b\n", list.contains(50));
		
	}
}
