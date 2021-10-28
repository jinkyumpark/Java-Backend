package days09;

public class Array03 {
	public static void main(String[] args) {
		int[] a = {56, 87, 96};
		
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(max < a[i])
				max = a[i];
		}
		
		int min = a[0];
		for(int i = 1; i < a.length; i++) {
			if(min > a[i])
				min = a[i];
		}
	}
}
