package days11;

public class Method16 {
	public static void main(String[] args) {
		cals("sum", 98, 78, 45, 12, 23, 87, 69, 59);
		System.out.println();
		cals("average", 98, 78, 45, 12, 23, 32, 98, 63, 25, 87);
	}
	
	public static void cals(String op, int... input) {
		int sum = 0;
		double average = 0;
		
		for(int i = 0; i < input.length; i++) {
			sum += input[i];
		}
		
		average = sum / input.length;
		
		
		if(op.equals("sum")) {
			System.out.printf("Sum : %d", sum);
		} else {
			System.out.printf("Average : %f", average);
		}
	}
}
