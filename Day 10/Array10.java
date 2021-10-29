package days10;

public class Array10 {
	public static void main(String[] args) {
		int[] a = multipleArray(3);
		int[] b = multipleArray(5);
		int[] c = multipleArray(8);
				
		printArray(a, "a");
		printArray(b, "b");
		printArray(c, "c");
	}
	
	public static int[] multipleArray(int multiple) {
		int[] result = new int[10];
		
		int index = 0;
		int num = 1;
		
		while(index != 10) {
			if(num % multiple == 0) {
				result[index] = num;
				index++;
			}
			num++;
		}

		return result;
	}

	public static void printArray(int[] inArr, String name) {
		System.out.printf("%s : { ", name);
		for(int i = 0; i < inArr.length-1; i++) {
			System.out.printf("%d, ", inArr[i]);
		}
		System.out.printf("%d }\n", inArr[inArr.length-1]);
	}
}
