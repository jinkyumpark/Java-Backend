package days11;

public class Method06 {
	public static void main(String[] args) {
		int[] a = {56, 54, 87, 89, 25, 36, 57, 98, 59, 87};
		
		System.out.printf("Sum : %d", sum(a));
		
	}
	
	public static int sum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
