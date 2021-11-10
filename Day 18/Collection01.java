package days18;
import java.util.Vector;
import java.util.ArrayList;

public class Collection01 {
	public static void main(String[] args) {
		
		v.add(10);
		v.add(20);
		v.add(30);
		
		a.add(10);
		a.add(20);
		a.add(30);
		
		for(int i = 0; i < v.size(); i++)
			System.out.printf("v[%d] = %d\t\t",i, v.get(i));
		
		System.out.println();
		
		for(int i = 0; i < a.size(); i++)
			System.out.printf("a[%d] = %d\t\t", i, a.get(i));
		
		a.set(2, 100);
		System.out.println();
		for(int i = 0; i < a.size(); i++)
			System.out.printf("a[%d] = %d\t\t", i, a.get(i));
		
		a.add(2, 300);
		System.out.println();
		for(int i = 0; i < a.size(); i++)
			System.out.printf("a[%d] = %d\t\t", i, a.get(i));
		
		
	}
}
