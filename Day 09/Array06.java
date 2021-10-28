package days09;
import java.util.Random;

public class Array06 {
	public static void main(String[] args) {
		// 로또 번호 1-45
		
		int[] num = new int[6];
		Random rd = new Random();
		
		// Generate Numbers
		for(int i = 0; i < num.length; i++) {
			num[i] = rd.nextInt();
			if(num[i] < 0) num[i] *= -1;
			num[i] = num[i] % 45 + 1;
			
			// Remove Duplicate
			int j;
			for(j = 0; j < i; j++) 
				if(num[i] == num[j]) break;
			if(i != j) i--;
		}
		
		// Sort Numbers
		for(int i = 0; i < num.length; i++) {
			for(int j = i+1; j < num.length; j++) {
				if(num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		
		// Print Numbers
		System.out.print("Number: { ");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.print("}");
		
	}
}
